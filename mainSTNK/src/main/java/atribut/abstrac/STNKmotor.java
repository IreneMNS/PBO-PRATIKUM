/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atribut.abstrac;

/**
 *
 * @author NITRO V15
 */
public final class STNKmotor extends detailSTNK {
    private final int jumlahRoda = 2;  // Kendaraan roda dua
    private final String jenisSIM = "SIM C";  // SIM C untuk motor
    private final String bahanBakar = "Bensin";  // Bahan bakar motor biasanya bensin

    // Constructor untuk STNKmotor
    public STNKmotor(Integer nomorSTNK, String nomorRegis, String namaPemilik, String jenisKendaraan, String tahunPembuatan) {
        super(nomorSTNK, nomorRegis, namaPemilik, jenisKendaraan, tahunPembuatan);
    }

    // Getter khusus untuk STNKmotor
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
        System.out.println("Nomor STNK Motor: " + getNomorSTNK() +
                ", Nomor Registrasi: " + getNomorRegis() +
                ", Nama Pemilik: " + getNamaPemilik() +
                ", Jenis Kendaraan: " + getJenisKendaraan() +
                ", Tahun Pembuatan: " + getTahunPembuatan() +
                ", Jumlah Roda: " + jumlahRoda +
                ", Jenis SIM: " + jenisSIM +
                ", Bahan Bakar: " + bahanBakar);
    }
}



