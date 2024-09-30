/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minpro1stnk;
import com.mycompany.minpro1stnk.STNK.STNK;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NITRO V15
 */
public class Minpro1stnk {
static ArrayList<STNK> stnkList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menuUtama();
        }
    }

    public static void menuUtama() {
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
            System.out.println("Terima kasih telah menggunakan membuat STNK demi keselamatan anda dan kendaraan anda!");
            System.exit(0);
        }
        default -> System.out.println("Pilihan tidak valid.");
    }
}

    public static void tambahSTNK() {
        System.out.print("Masukkan Nomor STNK: ");
        String nomor = scanner.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jenis Kendaraan: ");
        String jenis = scanner.nextLine();

        STNK stnk = new STNK(nomor, nama, jenis);
        stnkList.add(stnk);
        System.out.println("STNK berhasil ditambahkan.");
    }

    public static void lihatSTNK() {
        if (stnkList.isEmpty()) {
            System.out.println("Belum ada data STNK.");
        } else {
            System.out.println("\n--- Daftar STNK ---");
            for (STNK stnk : stnkList) {
                stnk.tampilkanData();
            }
        }
    }

    public static void ubahSTNK() {
        System.out.print("Masukkan Nomor STNK yang akan diubah: ");
        String nomor = scanner.nextLine();
        boolean found = false;

        for (STNK stnk : stnkList) {
            if (stnk.getNomorSTNK().equals(nomor)) {
                System.out.print("Masukkan Nama Pemilik baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan Jenis Kendaraan baru: ");
                String jenisBaru = scanner.nextLine();
                
                stnk.setNamaPemilik(namaBaru);
                stnk.setJenisKendaraan(jenisBaru);
                System.out.println("STNK berhasil diubah.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("STNK dengan nomor tersebut tidak ditemukan.");
        }
    }

    public static void hapusSTNK() {
        System.out.print("Masukkan Nomor STNK yang akan dihapus: ");
        String nomor = scanner.nextLine();
        boolean found = false;

        for (STNK stnk : stnkList) {
            if (stnk.getNomorSTNK().equals(nomor)) {
                stnkList.remove(stnk);
                System.out.println("STNK berhasil dihapus.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("STNK dengan nomor tersebut tidak ditemukan.");
        }
    }

    
}
