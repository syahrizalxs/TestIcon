/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.barangModel;

/**
 *
 * @author Syahrizal
 */
@WebServlet(name = "barangController", urlPatterns = {"/barangController"})
public class barangController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("menuutama")) {
            response.sendRedirect("index.jsp");
        } else if (proses.equals("input-barang")) {
            response.sendRedirect("tambahdata.jsp");
            return;
        } else if (proses.equals("edit-barang")) {
            response.sendRedirect("edit_barang.jsp?id=" + request.getParameter("id"));
            return;
        } else if (proses.equals("hapus-barang")) {
            barangModel hm = new barangModel();
            hm.setKodeBarang(request.getParameter("id"));
            hm.hapus();
            
            response.sendRedirect("index.jsp");
        }else if (proses.equals("data_penjualan")) {
            response.sendRedirect("penjualan_barang.jsp");
            return;
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String data = request.getParameter("data");
        String proses = request.getParameter("proses");

        if (data != null) {
            if (data.equals("barang")) {
                barangModel um = new barangModel();
                um.setKodeBarang(request.getParameter("kodeBarang"));
                um.setNamaBarang(request.getParameter("namaBarang"));
                um.setHargaJual(request.getParameter("hargaJual"));
                um.setHargaBeli(request.getParameter("hargaBeli"));
                um.setSatuan(request.getParameter("satuan"));
                um.setKategori(request.getParameter("kategori"));
                if (proses.equals("menuutama")) {
                    response.sendRedirect("index.jsp");
                } else if (proses.equals("input-barang")) {
                    um.simpan();
                } else if (proses.equals("edit-barang")) {
                    um.update();
                } else if (proses.equals("hapus-barang")) {
                    um.hapus();
                }
//                response.sendRedirect("index.jsp");
                response.sendRedirect("index.jsp");
            }
        }
    }
}
