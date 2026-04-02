package minggu6;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        String dummy;
        int jmlsiswa;
        System.out.print("Masukkan jumlah siswa :  ");
        dummy = galuh.nextLine();
        jmlsiswa = Integer.parseInt(dummy);
        MahasiswaBerprestasi08 list = new MahasiswaBerprestasi08();
        list.input = jmlsiswa;
        Mahasiswa08 m[] = new Mahasiswa08[jmlsiswa];
        for (int i = 0; i < jmlsiswa; i++) {
            System.out.print("Masukkan NIM siswa ke-" + (i + 1) + "   :   ");
            String nim = galuh.nextLine();
            System.out.print("Masukkan Nama siswa ke-" + (i + 1) + "  :   ");
            String nama = galuh.nextLine();
            System.out.print("Masukkan Kelas siswa ke-" + (i + 1) + " :   ");
            String kelas = galuh.nextLine();
            System.out.print("Masukkan IPK siswa ke-" + (i + 1) + "   :   ");
            dummy = galuh.nextLine();
            double ipk = Double.parseDouble(dummy);
            System.out.println("========================================");
            m[i] = new Mahasiswa08(nim, nama, kelas, ipk);
        }

        list.tambah(m);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

    }

}