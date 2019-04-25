
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.barangModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Master barang</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    
    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-success">
            <a class="navbar-brand" href="#">barang</a>
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
            
            
             <a class="btn btn-primary mb-3 mt-3" href="barangController?proses=input-barang">Tambah data</a>
        
          <table class="table">
          <thead class="thead-dark">
            <tr>
              <th scope="col">Kode Barang</th>
              <th scope="col">Nama Barang</th>
              <th scope="col">Harga Jual</th>
              <th scope="col">Harga Beli</th>
              <th scope="col">Satuan</th>
              <th scope="col">Kategori</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
                      <%
            barangModel km = new barangModel();
            List<barangModel> data = new ArrayList<barangModel>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            }
            for (int x = 0; x < data.size(); x++) {
        %>
            <tr>
              <th scope="row"><%=data.get(x).getKodeBarang()%></th>
                <td><%=data.get(x).getNamaBarang()%></td>
                <td><%=data.get(x).getHargaJual()%></td>
                <td><%=data.get(x).getHargaBeli()%></td>
                <td><%=data.get(x).getSatuan()%></td>
                <td><%=data.get(x).getKategori()%></td>
                <td>    
                    <a class="btn btn-success" href="barangController?proses=edit-barang&id=<%=data.get(x).getKodeBarang()%>">Edit</a>
                    <a class="btn btn-danger" href="barangController?proses=hapus-barang&id=<%=data.get(x).getKodeBarang()%>">Hapus</a>
                </td>
            </tr>
          </tbody>
           <%}%>
        </table>
        </div>
       
</body>
</html>
