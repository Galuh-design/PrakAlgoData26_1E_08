package minggu3;

import java.util.Scanner;

public class DosenDemo08 {
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        int jumlahDosen, usia;
        String dummy, KODE, NAMA, jk;
        boolean jenisKelamin;
        System.out.print("Masukkan jumlah dosen: ");
        dummy = galuh.nextLine();
        jumlahDosen = Integer.parseInt(dummy);

        Dosen08[] daftarDosen = new Dosen08[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            KODE = galuh.nextLine();
            System.out.print("Nama          : ");
            NAMA = galuh.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            jk = galuh.nextLine();
            if (jk.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            
            System.out.print("Usia          : ");
            dummy = galuh.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------------------");
            daftarDosen[i] = new Dosen08(KODE, NAMA, jenisKelamin, usia);
        }

        System.out.println("===============================");
        System.out.println("       DATA SELURUH DOSEN      ");
        System.out.println("===============================");
        
        int no = 1;
        for (Dosen08 dosen : daftarDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.print("Jenis Kelamin : ");
            if (dosen.jenisKelamin == true) {
                System.out.print("Pria");
                System.out.println();
            } else {
                System.out.print("Wanita");
                System.out.println();
            }
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-------------------------------");
            no++;
        }
    }
}