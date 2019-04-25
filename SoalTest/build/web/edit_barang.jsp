<%-- 
    Document   : edit_barang
    Created on : Oct 30, 2018, 11:15:33 PM
    Author     : Bagas Farezka
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.barangModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Barang</title>
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
        <h1>Edit Data</h1>
         <%
                String id = request.getParameter("id");
                barangModel km = new barangModel();
                km.setKodeBarang(id);
                List<barangModel> data = new ArrayList<barangModel>();
                data = km.cariKDBRG();
                if (data.size() > 0) {

            %>
        <form  action="barangController?data=barang&proses=edit-barang" method="post">
            <div class="form-group">
              <label for="kodeBarang">Kode Barang</label>
              <input type="text" class="form-control" id="kodebarang" name="kodeBarang"  value="<%=data.get(0).getKodeBarang()%>">
            </div>
            <div class="form-group">
              <label for="namaBarang">Nama Barang</label>
              <input type="text" class="form-control" name="namaBarang" value="<%=data.get(0).getNamaBarang()%>">
              <input type="hidden" class="form-control" name="id" value="<%=data.get(0).getKodeBarang()%>">
            </div>
             <div class="form-group">
              <label for="hargaJual">Harga Jual</label>
               <input type="text" class="form-control" name="hargaJual" value="<%=data.get(0).getHargaJual()%>">
              <input type="hidden" class="form-control" name="id" value="<%=data.get(0).getKodeBarang()%>">
            </div>
             <div class="form-group">
              <label for="hargaBeli">Harga Beli</label>
              <input type="text" class="form-control" name="hargaBeli" value="<%=data.get(0).getHargaBeli()%>">
              <input type="hidden" class="form-control" name="id" value="<%=data.get(0).getKodeBarang()%>">
            </div>
            <div class="form-group">
              <label for="satuan">Satuan</label>
              <input type="text" class="form-control" name="satuan" value="<%=data.get(0).getSatuan()%>">
              <input type="hidden" class="form-control" name="id" value="<%=data.get(0).getKodeBarang()%>">
            </div>
            <div class="form-group">
              <label for="kategori">kategori</label>
              <input type="text" class="form-control" name="kategori" value="<%=data.get(0).getKategori()%>">
              <input type="hidden" class="form-control" name="id" value="<%=data.get(0).getKodeBarang()%>">
            </div>
             <%}%>
            <button type="submit" value="tambah" class="btn btn-primary">Ubah</button>
          </form>
        </div>
    
   
</body>
</html>
