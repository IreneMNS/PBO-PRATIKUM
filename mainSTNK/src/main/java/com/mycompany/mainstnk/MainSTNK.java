/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainstnk;

import atribut.abstrac.CrudSTNK;
import atribut.abstrac.STNKmobil;
import atribut.abstrac.STNKmotor;
import atribut.abstrac.detailSTNK;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NITRO V15
 */
public class MainSTNK implements CrudSTNK {
    static ArrayList<detailSTNK> stnkList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainSTNK app = new MainSTNK(); // Instance dari Minpro1stnk
        while (true) {
            app.menuUtama();
        }
    }

    public void menuUtama() {
        System.out.println("\n--- Sistem Manajemen Pembuatan STNK ---");
        System.out.println("1. Tambah STNK");
        System.out.println("2. Lihat STNK");
        System.out.println("3. Ubah STNK");
        System.out.println("4. Hapus STNK");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline

        switch (pilihan) {
            case 1 -> tambahSTNK();
            case 2 -> lihatSTNK();
            case 3 -> ubahSTNK();
            case 4 -> hapusSTNK();
            case 5 -> {
                System.out.println("Terima kasih telah menggunakan sistem ini!");
                System.exit(0);
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    @Override
    public void tambahSTNK() {
        System.out.print("Masukkan Nomor STNK: ");
        Integer nomor = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline
        System.out.print("Masukkan Nomor Registrasi: ");
        String nomorRegis = scanner.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kendaraan: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Tahun Pembuatan: ");
        String tahun = scanner.nextLine();

        detailSTNK stnk;
        if (jenis.equalsIgnoreCase("mobil")) {
            stnk = new STNKmobil(nomor, nomorRegis, nama, jenis, tahun);
        } else {
            stnk = new STNKmotor(nomor, nomorRegis, nama, jenis, tahun);
        }

        stnkList.add(stnk);
        System.out.println("STNK berhasil ditambahkan.");
    }

 
    @Override
public void lihatSTNK() {
    if (stnkList.isEmpty()) {
        System.out.println("Belum ada data STNK.");
    } else {
        System.out.println("\n--- Daftar STNK ---");
        for (detailSTNK stnk : stnkList) {
            stnk.tampilkanData();
        }
    }
}

    @Override
    public void ubahSTNK() {
        System.out.print("Masukkan Nomor STNK yang akan diubah: ");
        Integer nomor = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline
        boolean found = false;

        for (detailSTNK stnk : stnkList) {
            if (stnk.getNomorSTNK().equals(nomor)) {
                System.out.print("Masukkan Nama Pemilik baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan Jenis Kendaraan baru: ");
                String jenisBaru = scanner.nextLine();
                System.out.print("Masukkan Tahun Pembuatan baru: ");
                String tahunBaru = scanner.nextLine();

                stnk.setNamaPemilik(namaBaru);
                stnk.setJenisKendaraan(jenisBaru);
                stnk.setTahunPembuatan(tahunBaru);
                System.out.println("STNK berhasil diubah.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("STNK tidak ditemukan.");
        }
    }

    @Override
    public void hapusSTNK() {
        System.out.print("Masukkan Nomor STNK yang akan dihapus: ");
        Integer nomor = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline
        boolean found = false;

        for (int i = 0; i < stnkList.size(); i++) {
            if (stnkList.get(i).getNomorSTNK().equals(nomor)) {
                stnkList.remove(i);
                System.out.println("STNK berhasil dihapus.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("STNK tidak ditemukan.");
        }
    }
}





