<%-- 
    Document   : tambahdata
    Created on : Apr 25, 2019, 2:24:57 PM
    Author     : Syahrizal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>tambah Data Barang </title>
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
        <h1>Tambah Data barang</h1>
        
        <form  action="barangController?data=barang&proses=input-barang" method="post">
            <div class="form-group">
              <label for="kodeBarang">Kode Barang</label>
              <input type="text" class="form-control" id="kodebarang" name="kodeBarang">
            </div>
            <div class="form-group">
              <label for="namaBarang">Nama Barang</label>
              <input type="text" class="form-control" id="namabarang" name="namaBarang">
            </div>
             <div class="form-group">
              <label for="hargaJual">Harga Jual</label>
              <input type="text" class="form-control" id="hargajual" name="hargaJual">
            </div>
             <div class="form-group">
              <label for="hargaBeli">Harga Beli</label>
              <input type="text" class="form-control" id="hargabeli" name="hargaBeli">
            </div>
            <div class="form-group">
              <label for="satuan">Satuan</label>
              <input type="text" class="form-control" id="satuan" name="satuan">
            </div>
            <div class="form-group">
              <label for="kategori">kategori</label>
              <input type="text" class="form-control" id="kategori" name="kategori">
            </div>
           
            <button type="submit" value="tambah" class="btn btn-primary">Tambah</button>
          </form>
        </div>
    </body>
</html>
