package minggu11;

public class Mahasiswa08 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa08() {
    }

    public Mahasiswa08(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.print(nama);
        System.out.print(nim);
        System.out.print(kelas);
        System.out.print(ipk);
    }

}