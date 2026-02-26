package minggu3;

import java.util.Scanner;

public class MataKuliahDemo08 {
public static void main(String[] args) {
    String KODE, NAMA;
    int SKS,JAM;
    Matakuliah08 [] arrayOfMatakuliah = new Matakuliah08[3];
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
        System.out.println("Data Matakuliah ke-" + (i + 1));
        System.out.println("Kode        :"+arrayOfMatakuliah[i].kode);
        System.out.println("Nama        :"+arrayOfMatakuliah[i].nama);
        System.out.println("SKS         :"+arrayOfMatakuliah[i].sks);
        System.out.println("Jumlah Jam  :"+arrayOfMatakuliah[i].jumlahJam);
        System.out.println("-----------------------");
    }   



}




}