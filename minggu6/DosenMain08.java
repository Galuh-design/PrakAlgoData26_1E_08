package minggu6;

import java.util.Scanner;

public class DosenMain08 {
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        String dummy;
        int jmldata;
        DataDosen08 data = new DataDosen08();
        System.out.print("Masukkan banyak dosen : ");
        dummy = galuh.nextLine();
        jmldata = Integer.parseInt(dummy);
        data.input = jmldata;
        Dosen08 databaseDosen[] = new Dosen08[jmldata];

        for (int i = 0; i < jmldata; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i + 1));
            System.out.println("-----------------------------");
            System.out.print("Kode                        : ");
            String Kode = galuh.nextLine();
            System.out.print("Nama                        : ");
            String Nama = galuh.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jenis = galuh.nextLine();
            boolean kelamin;
            if (jenis.equalsIgnoreCase("Pria")) {
                kelamin = true;
            } else {
                kelamin = false;
            }
            System.out.print("Usia                        : ");
            dummy = galuh.nextLine();
            int usia = Integer.parseInt(dummy);
            databaseDosen[i] = new Dosen08(Kode, Nama, kelamin, usia);
        }

        data.importdata(databaseDosen);
        System.out.println("Data yang sudah terurut menggunakan BUBBLE SORT (ASC)");
        data.bubble();
        data.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
        data.insertion();
        data.tampil();
    }

}