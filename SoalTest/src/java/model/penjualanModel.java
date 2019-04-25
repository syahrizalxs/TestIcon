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
public class penjualanModel {
    String tglFaktur,noFaktur,namaKonsumen,kodeBarang,jumlah,hargaSatuan,hargaTotal,namaBarang,stok;

    public penjualanModel(){
        db = new koneksi();
    }
    
    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    koneksi db = null;

    public String getTglFaktur() {
        return tglFaktur;
    }

    public void setTglFaktur(String tglFaktur) {
        this.tglFaktur = tglFaktur;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    public String getNamaKonsumen() {
        return namaKonsumen;
    }

    public void setNamaKonsumen(String namaKonsumen) {
        this.namaKonsumen = namaKonsumen;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(String hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(String hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

    public koneksi getDb() {
        return db;
    }

    public void setDb(koneksi db) {
        this.db = db;
    }
    
    public List tampil() {
        List<penjualanModel> data = new ArrayList<penjualanModel>();
        ResultSet rs = null;

        try {
            String sql = "select * from penjualan ";
            rs = db.ambilData(sql);
            while (rs.next()) {
                penjualanModel um = new penjualanModel();
                um.setTglFaktur(rs.getString("tglFaktur"));
                um.setNoFaktur(rs.getString("noFaktur"));
                um.setNamaKonsumen(rs.getString("namaKonsumen"));
                um.setKodeBarang(rs.getString("kodeBarang"));
                um.setNamaBarang(rs.getString("namaBarang"));
                um.setJumlah(rs.getString("jumlah"));
                um.setHargaSatuan(rs.getString("hargaSatuan"));
                um.setHargaTotal(rs.getString("hargaTotal"));
                data.add(um);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalahan Saat menampilkan data User" + ex);
        }
        return data;
    }
    
       public void simpan() {
        String sql = "INSERT INTO penjualan values('" + tglFaktur + "', '" + noFaktur + "', '" + namaKonsumen + "', '" + kodeBarang + "','" + namaBarang + "','"+ jumlah +"','"+ hargaSatuan +"','"+ hargaTotal +"')";
        db.simpanData(sql);
    }
       
        
        public void hapus(){
        String sql="DELETE FROM penjualan WHERE noFaktur='"+noFaktur+"'";
        db.simpanData(sql);
        System.out.println("");
        }
        
        public List cariNOFAKTUR() {
        List<penjualanModel> data = new ArrayList<penjualanModel>();
        ResultSet rs = null;

        try {
            String sql = "SELECT * FROM penjualan WHERE noFaktur='"+noFaktur+ "'";
            rs = db.ambilData(sql);
            while (rs.next()) {
                penjualanModel pm = new penjualanModel();
                pm.setTglFaktur(rs.getString("tglFaktur"));
                pm.setNoFaktur(rs.getString("noFaktur"));
                pm.setNamaKonsumen(rs.getString("namaKonsumen"));
                pm.setKodeBarang(rs.getString("kodeBarang"));
                pm.setNamaBarang(rs.getString("namaBarang"));
                pm.setJumlah(rs.getString("jumlah"));
                pm.setHargaSatuan(rs.getString("hargaSatuan"));
                pm.setHargaTotal(rs.getString("hargaTotal"));
                data.add(pm);

            }
            db.diskonek(rs);
        } catch (Exception ex) {
            System.out.println("Terjadi Kesalah Saat menampilkan Cari Kode Barang" + ex);
        }
        return data;

    }
    
}
