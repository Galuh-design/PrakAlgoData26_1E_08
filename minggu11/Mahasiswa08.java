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
        System.out.println();
        System.out.printf("%-15s", nama);
        System.out.printf("%10s", nim);
        System.out.printf("%10s", kelas);
        System.out.printf("%10s", ipk);
    }

}