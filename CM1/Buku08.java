package CM1;

public class Buku08 {
    String kodeBuku;
    String judul;
    int tahunTerbiit;
    Buku08 () {}
    Buku08(String kodeBuku, String judul, int tahunTerbiit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbiit = tahunTerbiit;
    }
//void output
    void tampilBuku() {
        System.out.print("Kode   :  " + kodeBuku + " | ");
        System.out.print("Judul  :  " + judul + " | ");
        System.out.print("Tahun  :  " + tahunTerbiit );

    }
}