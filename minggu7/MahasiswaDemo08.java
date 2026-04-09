package minggu7;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
        Scanner galuh = new Scanner(System.in);
        
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = galuh.nextLine();
            System.out.print("Nama  : ");
            String nama = galuh.nextLine();
            System.out.print("Kelas : ");
            String kelas = galuh.nextLine();
            System.out.print("IPK   : ");
            String ip = galuh.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------------------");
            list.tambah(new Mahasiswa08(nim, nama, kelas, ipk));
        }

        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = galuh.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
        