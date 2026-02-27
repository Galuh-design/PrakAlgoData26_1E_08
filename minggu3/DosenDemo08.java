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



        DataDosen08 dataPengolah = new DataDosen08();
        dataPengolah.dataSemuaDosen(daftarDosen);
        dataPengolah.jumlahDosenPerJenisKelamin(daftarDosen);
        dataPengolah.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        dataPengolah.infoDosenPalingTua(daftarDosen);
        dataPengolah.infoDosenPalingMuda(daftarDosen);
    }
}