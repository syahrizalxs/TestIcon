
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.penjualanModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    
    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-success">
            <a class="navbar-brand" href="#">Penjualan</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link" href="barangController?proses=menuutama">Data Barang</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="penjualanController?proses=menupenjualan">Penjualan</a>
                </li>           
              </ul>
            </div>
           </nav>
   
        <div class="container">
            
            
             <a class="btn btn-primary mb-3 mt-3" href="penjualanController?proses=input-penjualan">Tambah data</a>
        
          <table class="table">
          <thead class="thead-dark">
            <tr>
              <th scope="col">Tanggal Faktur</th>
              <th scope="col">No faktur</th>
              <th scope="col">Nama Konsumen</th>
              <th scope="col">Kode Barang</th>
              <th scope="col">Nama Barang</th>
              <th scope="col">Jumlah</th>
              <th scope="col">Harga Satuan</th>
              <th scope="col">Harga Total</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
                      <%
            penjualanModel km = new penjualanModel();
            List<penjualanModel> data = new ArrayList<penjualanModel>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        %>
            <tr>
              <th scope="row"><%=data.get(x).getTglFaktur()%></th>
                <td><%=data.get(x).getNoFaktur()%></td>
                <td><%=data.get(x).getNamaKonsumen()%></td>
                <td><%=data.get(x).getKodeBarang()%></td>
                <td><%=data.get(x).getNamaBarang()%></td>
                <td><%=data.get(x).getJumlah()%></td>
                <td><%=data.get(x).getHargaSatuan()%></td>
                <td><%=data.get(x).getHargaTotal()%></td>
                <td> 
                    <a class="btn btn-danger" href="penjualanController?proses=hapus-penjualan&id=<%=data.get(x).getNoFaktur()%>">Hapus</a>
                </td>
            </tr>
          </tbody>
           <%}%>
        </table>
        </div>
       
</body>
</html>
