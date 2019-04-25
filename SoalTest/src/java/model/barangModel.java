/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import koneksi.koneksi;

/**
 *
 * @author Syahrizal
 */
public class barangModel {
     
     String kodeBarang,namaBarang,hargaJual,hargaBeli,satuan,kategori;
     koneksi db = null;
    
     public barangModel() {
        db = new koneksi();
    }
    
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(String hargaJual) {
        this.hargaJual = hargaJual;
    }

    public String getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(String hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public koneksi getDb() {
        return db;
    }

    public void setDb(koneksi db) {
        this.db = db;
    }
   
    public List tampil() {
        List<barangModel> data = new ArrayList<barangModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from barang order by namaBarang asc";
            rs = db.ambilData(sql);
            while (rs.next()) {
                barangModel um = new barangModel();
                um.setKodeBarang(rs.getString("kodeBarang"));
                um.setNamaBarang(rs.getString("namaBarang"));
                um.setHargaJual(rs.getString("hargaJual")); 
                um.setHargaBeli(rs.getString("hargaBeli"));
                um.setSatuan(rs.getString("satuan"));
                um.setKategori(rs.getString("kategori"));
                data.add(um);
            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
     
       public void simpan() {
        String sql = "INSERT INTO barang values('" + kodeBarang + "', '" + namaBarang + "', '" + hargaJual + "', '" + hargaBeli + "','" + satuan + "','" + kategori + "')";
        db.simpanData(sql);
    }
       
        public void update() {
        String sql = "UPDATE barang SET namaBarang='"+namaBarang+"',hargaJual='"+hargaJual+"',hargaBeli='"+hargaBeli + "',satuan='"+satuan+"',kategori='"+kategori+"' WHERE kodeBarang='"+kodeBarang+"'";
        db.simpanData(sql);
        }
        
        public void hapus(){
        String sql="DELETE FROM barang WHERE kodeBarang='"+kodeBarang+"'";
        db.simpanData(sql);
        System.out.println("");
        }
        
        public List cariKDBRG() {
        List<barangModel> data = new ArrayList<barangModel>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM barang WHERE kodeBarang='"+kodeBarang+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                barangModel um = new barangModel();
                um.setKodeBarang(rs.getString("kodeBarang"));
                um.setNamaBarang(rs.getString("namaBarang"));
                um.setHargaJual(rs.getString("hargaJual")); 
                um.setHargaBeli(rs.getString("hargaBeli"));
                um.setSatuan(rs.getString("satuan"));
                um.setKategori(rs.getString("kategori"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
    
    
}
