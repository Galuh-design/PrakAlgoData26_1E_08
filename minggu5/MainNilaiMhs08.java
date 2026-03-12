package minggu5;

import java.util.Scanner;

public class MainNilaiMhs08 {
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        String dummy;
        System.out.print("Masukkan jumlah Siswa     : ");
        dummy = galuh.nextLine();
        int jmlMhs = Integer.parseInt(dummy);
        NilaiMhs08[] arrMhs = new NilaiMhs08[jmlMhs];
        int arruas[] = new int[jmlMhs];
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan Nama             : ");
            String name = galuh.nextLine();
            System.out.print("Masukkan NIM              : ");
            String nim = galuh.nextLine();
            System.out.print("Masukkan Tahun Masuk      : ");
            dummy = galuh.nextLine();
            int tahun = Integer.parseInt(dummy);
            System.out.print("Masukkan nilai UTS        : ");
            dummy = galuh.nextLine();
            int uts = Integer.parseInt(dummy);
            System.out.print("Masukkan nilai UAS        : ");
            dummy = galuh.nextLine();
            int uas = Integer.parseInt(dummy);
            System.out.println("===============================");
            arruas[i] = uas;
            arrMhs[i] = new NilaiMhs08(name, nim, tahun, uts, uas);

        }

        NilaiMhs08 maxuts = NilaiMhs08.MaxutsDC(arrMhs, 0, jmlMhs - 1);
        NilaiMhs08 minuts = NilaiMhs08.MinutsDC(arrMhs, 0, jmlMhs - 1);
        NilaiMhs08 rata = new NilaiMhs08();
        System.out.printf("%-20s | %-20s | %-20s | %-20s | %-20s", "NAMA", "NIM", "TAHUN MASUK", "UTS", "UAS");
        System.out.println();
        for (NilaiMhs08 arriy : arrMhs) {
            System.out.printf("%-20s | %-20s | %-20d | %-20d | %-20d", arriy.nama, arriy.nim, arriy.thMasuk, arriy.uts,
                    arriy.uas);
            System.out.println();
        }
        System.out.println("===============================");
        System.out.println("Nilai Tertinggi UTS adalah  :");
        System.out.printf("%-20s | %-20s | %-20d | %-20d | %-20d ", maxuts.nama, maxuts.nim, maxuts.thMasuk, maxuts.uts,
                maxuts.uas);
        System.out.println();
        System.out.println("Nilai Terendah UTS adalah   :");
        System.out.printf("%-20s | %-20s | %-20d | %-20d | %-20d ", minuts.nama, minuts.nim, minuts.thMasuk, minuts.uts,
                minuts.uas);
        System.out.println();
        System.out.println("Rata - rata UAS adalah      : " + rata.rataUasBF(arruas, jmlMhs));
    }

}