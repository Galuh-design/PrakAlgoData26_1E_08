package minggu6;

public class Dosen08 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen08() {
    }

    Dosen08(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.print("Jenis Kelamin   : ");
        if (jenisKelamin == true) {
            System.out.print("Pria");
            System.out.println();
        } else {
            System.out.print("Wanita");
            System.out.println();
        }
        System.out.println("Usia            : " + usia);
    }

}