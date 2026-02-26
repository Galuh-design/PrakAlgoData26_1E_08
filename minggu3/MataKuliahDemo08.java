package minggu3;

import java.util.Scanner;

public class MataKuliahDemo08 {
    public static void main(String[] args) {
        String KODE, NAMA;
        int SKS, JAM;
        Matakuliah08[] arrayOfMatakuliah = new Matakuliah08[3];
        Matakuliah08 tambahdata = new Matakuliah08();
        for (int i = 0; i < 3; i++) {

            tambahdata.tambahData();
            KODE = tambahdata.kode;
            NAMA = tambahdata.nama;
            SKS = tambahdata.sks;
            JAM = tambahdata.jumlahJam;

            arrayOfMatakuliah[i] = new Matakuliah08(KODE, NAMA, SKS, JAM);

        }
        for (int i = 0; i < 3; i++) {
            arrayOfMatakuliah[i].cetakInfo(
                    arrayOfMatakuliah[i].kode,
                    arrayOfMatakuliah[i].nama,
                    arrayOfMatakuliah[i].sks,
                    arrayOfMatakuliah[i].jumlahJam);
        }

    }

}