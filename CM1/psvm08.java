package CM1;

//import Scanner
import java.util.Scanner;

public class psvm08 {

    // Fungsi Main
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        do {
            String dummy;
            // Pembuatan Object dari Peminjaman08
            Peminjaman08 pinjam = new Peminjaman08();
            // Memasukkan data tanpa input dari pengguna
            pinjam.datasiswa();
            pinjam.databuku();
            pinjam.dataPinjam();
            pinjam.hitungdenda();

            //Interface
            System.out.println();
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1.  Tampilkan Mahasiswa");
            System.out.println("2.  Tampilkan Buku");
            System.out.println("3.  Tampilkan Peminjaman");
            System.out.println("4.  Urutkan Berdasarkan Denda");
            System.out.println("5.  Cari Berdasarkan NIM");
            System.out.println("0.  Keluar");
            System.out.print("Pilih: ");
            dummy = galuh.nextLine();
            int number = Integer.parseInt(dummy);

            //Kondisi tampilkan Daftar Mahasiswa
            if (number == 1) {
                pinjam.tampilsiswa();
            }

            //Kondisi tampilkan Daftar Buku
            if (number == 2) {
                pinjam.tampilbuku();
            }

            //Kondisi tampilkan Daftar Pinjaman
            if (number == 3) {
                pinjam.tampilPeminjaman();
            }

            //Kondisi Insertion Sorting
            if (number == 4) {
                pinjam.insertionSort();
                System.out.println("Setelah Diurutkan (Denda Terbesar):");
                pinjam.tampilPeminjaman();
            }

            //Kondisi Binary Search
            if (number == 5) {
                pinjam.insertionSort();
                System.out.print("Masukkan NIM: ");
                String nim = galuh.nextLine();
                pinjam.binarySearch(nim);

            }

            //Bila Input melebihi / kurang dari ketentuan
            if (number > 5 || number < 0) {
                System.out.println("Input tidak sesuai, Coba Lagi!");
                continue;
            }

            //Keluar dari Program
            if (number < 1) {
                System.out.println("Berhasil Keluar");
                break;
            }

        } while (true);
    }

}