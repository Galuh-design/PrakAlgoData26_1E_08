package minggu11;

import java.util.Scanner;

public class QueueDemo08 {
    public static void main(String[] args) {
        QueueLinkedList08 antrian = new QueueLinkedList08(); // object QueueLinkedList08
        MahasiswaTugas08 mhs;
        Scanner galuh = new Scanner(System.in);
        int pilih;
        String dummy;

        do { // Loop menu
            System.out.println("\n--- LAYANAN UNIT KEMAHASISWAAN ---");
            System.out.println("1. Tambah Antrian ");
            System.out.println("2. Panggil Antrian ");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Akhir");
            System.out.println("5. Lihat Jumlah Antrian");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            dummy = galuh.nextLine();
            pilih = Integer.parseInt(dummy);

            switch (pilih) {
                case 1: // input data
                    System.out.print("NIM: ");
                    String nim = galuh.nextLine();
                    System.out.print("Nama: ");
                    String nama = galuh.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = galuh.nextLine();
                    System.out.print("IPK: ");
                    dummy = galuh.nextLine();
                    Double ipk = Double.parseDouble(dummy);
                    mhs = new MahasiswaTugas08(nim, nama, kelas, ipk);
                    antrian.enqueue(mhs); // input objek mahasiswaTugas08 kedalam method enqueue
                    break;
                case 2:
                    antrian.dequeue(); // method dequeue
                    break;
                case 3:
                    antrian.peek(); // method peek untuk lihat terdepan
                    break;
                case 4:
                    antrian.peekUjung(); // method peekUjung untuk lihat terakhir
                    break;
                case 5:
                    antrian.displaySize(); // menunjukkan total jumlah antrian mahasiswa
                    break;
                case 6:
                    antrian.print(); // method output print
                    break;
                case 7:
                    antrian.remove(); // clear Queue
                    break;
            }
            if (pilih > 7 || pilih < 0) {
                System.out.println("Input Invalid"); // kondisi Human error
                continue;
            }
        } while (pilih != 0);
        System.out.println("Anda Berhasil Keluar!"); // print untuk menguji user berhasil keluar loop
    }
}