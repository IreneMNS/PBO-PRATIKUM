/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atribut.abstrac;

/**
 *
 * @author NITRO V15
 */
public final class STNKmobil extends detailSTNK {
    private final int jumlahRoda = 4;  // Kendaraan roda empat
    private final String jenisSIM = "SIM A";  // SIM A untuk mobil
    private final String bahanBakar = "Bensin atau Diesel";  // Bahan bakar mobil bisa bensin atau diesel

    // Constructor untuk STNKmobil
    public STNKmobil(Integer nomorSTNK, String nomorRegis, String namaPemilik, String jenisKendaraan, String tahunPembuatan) {
        super(nomorSTNK, nomorRegis, namaPemilik, jenisKendaraan, tahunPembuatan);
    }

    // Getter khusus untuk STNKmobil
    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public String getJenisSIM() {
        return jenisSIM;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    // Override metode tampilkanData dari kelas induk
    @Override
    public void tampilkanData() {
        System.out.println("Nomor STNK Mobil: " + getNomorSTNK() +
                ", Nomor Registrasi: " + getNomorRegis() +
                ", Nama Pemilik: " + getNamaPemilik() +
                ", Jenis Kendaraan: " + getJenisKendaraan() +
                ", Tahun Pembuatan: " + getTahunPembuatan() +
                ", Jumlah Roda: " + jumlahRoda +
                ", Jenis SIM: " + jenisSIM +
                ", Bahan Bakar: " + bahanBakar);
    }
}