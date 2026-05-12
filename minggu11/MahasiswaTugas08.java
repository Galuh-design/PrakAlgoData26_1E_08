package minggu11;

public class MahasiswaTugas08 {
    String nim, nama, kelas;
    double ipk;

    public MahasiswaTugas08(String nim, String nama, String kelas, double ipk) { //Konstruktor berparameter
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilData() { // method tampil data
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Kelas: " + kelas + " | IPK: " + ipk);
    }
}
