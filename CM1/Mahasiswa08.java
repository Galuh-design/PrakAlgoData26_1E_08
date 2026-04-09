package CM1;

public class Mahasiswa08 {
    String nim;
    String nama;
    String prodi;
    Mahasiswa08(){}
    Mahasiswa08(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
//void output
    void tampilMahasiswa(){
      System.out.print("NIM   :  "+nim+" | ");
    System.out.print("Nama  :  "+nama+" | ");
    System.out.print("Prodi :  "+prodi);
    }
}