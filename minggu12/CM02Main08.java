package minggu12;

import java.util.Scanner;

public class CM02Main08 {
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        CM02DLL08 list = new CM02DLL08();// objek DLL08 untuk pengoperasian

        int pilihan; // memilih
        do {
            System.out.println("==============================================");
            System.out.println("SISTEM ANTREAN ROYAL DELISH");
            System.out.println("==============================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = galuh.nextInt();
            galuh.nextLine();

            switch (pilihan) {
                case 1: // insert pembeli
                    System.out.print("Nama Pembeli : ");
                    String nama = galuh.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = galuh.nextLine();
                    list.tambahAntrian(nama, noHp);
                    break;
                case 2:// cetak antrian pembeli
                    list.cetakAntrian();
                    break;
                case 3:// insert pesanan
                    System.out.print("Kode Pesanan : ");
                    int kode = galuh.nextInt();
                    galuh.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String menuMakanan = galuh.nextLine();
                    System.out.print("Harga        : ");
                    int harga = galuh.nextInt();
                    list.hapusAntrianDanPesan(kode, menuMakanan, harga); // menghapus antrian pembeli terdepan (FIFO)
                    break;
                case 4:
                    list.laporanPesanan();// cetak laporan
                    break;
                case 0:
                    System.out.println("Thank you!, For all thy support. Galuh system Out");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! imput yang benar!.");
            }
        } while (pilihan != 0);
        galuh.close();
    }
}