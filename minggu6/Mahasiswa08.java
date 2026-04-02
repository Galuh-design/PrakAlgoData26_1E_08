package minggu6;

import minggu3.mahasiswa08;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // konstruktor default
    Mahasiswa08() {
    }

    // konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama
    // ada yang tidak)
    Mahasiswa08(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama    : "+nama);
        System.out.println("NIM     :"+nim);
        System.out.println("IPK     :"+ipk);
        System.out.println("Kelas   :"+kelas);
        
    }
}