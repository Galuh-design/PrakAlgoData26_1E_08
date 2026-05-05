package minggu10;

import java.util.Scanner;

public class KRSDemo08 {

    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        queueKRS08 q = new queueKRS08(10); // Max Queue adalah 10
        int pilih;

        do {
            System.out.println("\n--- Sistem Antrian KRS DPA ---");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil/Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Cetak Status & Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = galuh.nextInt();
            galuh.nextLine();

            switch (pilih) {
                case 1: // input data 
                    System.out.print("NIM: ");
                    String nim = galuh.nextLine();
                    System.out.print("Nama: ");
                    String nama = galuh.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = galuh.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = galuh.nextLine();
                    q.tambahAntrian(new mahasiswa_08(nim, nama, prodi, kelas));
                    break;
                case 2: // proses krs
                    q.prosesKRS();
                    break;
                case 3: // output di dalam Queue
                    q.tampilkanSemua();
                    break;
                case 4: // lihat 2 data paling awal di input
                    q.lihat2Terdepan();
                    break;
                case 5: // lihat data paling akhir di input
                    q.lihatAkhir();
                    break;
                case 6:// lihat status dari krs
                    q.cetakStatus();
                    break;
                case 7: //membersihkan queue
                    q.clear();
                    break;
            }
        } while (pilih != 0);
    }

}