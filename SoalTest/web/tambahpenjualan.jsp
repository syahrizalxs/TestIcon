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
        <title>tambah Penjualan</title>
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
        <h1>Tambah Data</h1>
        
        <form  action="penjualanController?data=penjualan&proses=input-penjualan" method="post">
            <div class="form-group">
              <label for="kodeBarang">Tanggal Faktur</label>
              <input type="text" class="form-control" id="kodebarang" name="tanggalFaktur">
            </div>
            <div class="form-group">
              <label for="namaBarang">No Faktur</label>
              <input type="text" class="form-control" id="namabarang" name="noFaktur">
            </div>
             <div class="form-group">
              <label for="hargaJual">Nama Konsumen</label>
              <input type="text" class="form-control" id="hargajual" name="namaKonsumen">
            </div>
             <div class="form-group">
              <label for="hargaBeli">Kode Barang</label>
              <input type="text" class="form-control" id="hargabeli" name="kodeBarang">
            </div>
            <div class="form-group">
              <label for="satuan">Nama Barang</label>
              <input type="text" class="form-control" id="satuan" name="namaBarang">
            </div>
            <div class="form-group">
              <label for="kategori">Jumlah</label>
              <input type="text" class="form-control" id="kategori" name="jumlah">
            </div>
           <div class="form-group">
              <label for="kategori">Harga Satuan</label>
              <input type="text" class="form-control" id="kategori" name="hargaSatuan">
            </div>
            <div class="form-group">
              <label for="kategori">Harga Total</label>
              <input type="text" class="form-control" id="kategori" name="hargaTotal">
            </div>
           
            <button type="submit" value="tambah" class="btn btn-primary">Tambah</button>
          </form>
        </div>
    </body>
</html>
