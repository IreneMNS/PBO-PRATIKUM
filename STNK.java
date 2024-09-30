/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minpro1stnk.STNK;

/**
 *
 * @author NITRO V15
 */
public class STNK {
    private String nomorSTNK;
    private String namaPemilik;
    private String jenisKendaraan;

    // Constructor
    public STNK(String nomorSTNK, String namaPemilik, String jenisKendaraan) {
        this.nomorSTNK = nomorSTNK;
        this.namaPemilik = namaPemilik;
        this.jenisKendaraan = jenisKendaraan;
    }

    
    public String getNomorSTNK() {
        return nomorSTNK;
    }

    public void setNomorSTNK(String nomorSTNK) {
        this.nomorSTNK = nomorSTNK;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    
    public void tampilkanData() {
        System.out.println("Nomor STNK: " + nomorSTNK + ", Nama Pemilik: " + namaPemilik + ", Jenis Kendaraan: " + jenisKendaraan);
    }
}
