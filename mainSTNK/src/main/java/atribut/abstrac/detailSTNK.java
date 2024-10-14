/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atribut.abstrac;

/**
 *
 * @author NITRO V15
 */

public abstract class detailSTNK {
    private final Integer nomorSTNK;  // Final karena nomor STNK tidak bisa diubah
    private final String nomorRegis;  // Final karena nomor registrasi tidak bisa diubah
    private String namaPemilik;
    private String jenisKendaraan;
    private String tahunPembuatan;

    // Constructor
    public detailSTNK(Integer nomorSTNK, String nomorRegis, String namaPemilik, String jenisKendaraan, String tahunPembuatan) {
        // Validasi input
        if (nomorSTNK == null || nomorRegis == null || namaPemilik == null || jenisKendaraan == null || tahunPembuatan == null) {
            throw new IllegalArgumentException("Semua parameter harus diisi.");
        }

        this.nomorSTNK = nomorSTNK;
        this.nomorRegis = nomorRegis;
        this.namaPemilik = namaPemilik;
        this.jenisKendaraan = jenisKendaraan;
        this.tahunPembuatan = tahunPembuatan;
    }

    // Getter
    public Integer getNomorSTNK() {
        return nomorSTNK;
    }

    public String getNomorRegis() {
        return nomorRegis;
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

    public String getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(String tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    // Metode abstract yang harus diimplementasikan oleh kelas turunan
    public abstract void tampilkanData();
}
