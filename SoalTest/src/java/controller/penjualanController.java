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
import model.penjualanModel;

/**
 *
 * @author Syahrizal
 */

@WebServlet(name = "penjualanController", urlPatterns = {"/penjualanController"})
public class penjualanController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String proses = request.getParameter("proses");
        String action = request.getParameter("action");
        if (proses.equals("menupenjualan")) {
            response.sendRedirect("penjualan.jsp");
        } else if (proses.equals("input-penjualan")) {
            response.sendRedirect("tambahpenjualan.jsp");
            return;
        } else if (proses.equals("hapus-penjualan")) {
            penjualanModel hm = new penjualanModel();
            hm.setNoFaktur(request.getParameter("id"));
            hm.hapus();      
            response.sendRedirect("penjualan.jsp");
        }else{
            response.sendRedirect("penjualan.jsp");
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
            if (data.equals("penjualan")) {
                penjualanModel um = new penjualanModel();

                um.setTglFaktur(request.getParameter("tanggalFaktur"));
                um.setNoFaktur(request.getParameter("noFaktur"));
                um.setNamaKonsumen(request.getParameter("namaKonsumen"));
                um.setKodeBarang(request.getParameter("kodeBarang"));
                um.setNamaBarang(request.getParameter("namaBarang"));
                um.setJumlah(request.getParameter("jumlah"));
                um.setHargaSatuan(request.getParameter("hargaSatuan"));
                um.setHargaTotal(request.getParameter("hargaTotal"));
                if (proses.equals("menupenjualan")) {
                    response.sendRedirect("penjualan.jsp");
                } else if (proses.equals("input-penjualan")) {
                    um.simpan();
                } else if (proses.equals("hapus-penjualan")) {
                    um.setNoFaktur(request.getParameter("id"));
                    um.hapus();
                }
                    response.sendRedirect("penjualan.jsp");
                }
        }
    }
}

