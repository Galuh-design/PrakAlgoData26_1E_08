package minggu9;

import java.util.Scanner;

public class stackDemo08 {
    public static void main(String[] args) {
        stackSurat08 stackMain = new stackSurat08(30); // sesuai jumlah siswa TI 1E
        Scanner galuh = new Scanner(System.in);
        int pilih;
        String dummy;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir"); // print menu
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.println("----------------------------");
            System.out.print("pilih     : "); // pemilihan menu
            dummy = galuh.nextLine();
            pilih = Integer.parseInt(dummy);

            if (pilih == 1) {
                System.out.println("------------------------------------------");
                System.out.println("=============== INPUT SURAT =============="); // input data ke stack
                System.out.println("------------------------------------------");
                System.out.println();
                System.out.print("Id Surat                      : ");
                String idsurat = galuh.nextLine();
                System.out.print("Nama Mahasiswa                : ");
                String nama = galuh.nextLine();
                System.out.print("Kelas                         : ");
                String kelas = galuh.nextLine();
                System.out.print("Jenis Izin (Sakit/Izin/Alpha) : ");
                dummy = galuh.nextLine();
                char izin = dummy.charAt(0);
                izin = Character.toUpperCase(izin);
                System.out.print("Durasi Izin (hari)            : ");
                dummy = galuh.nextLine();
                int duration = Integer.parseInt(dummy);
                surat08 surat = new surat08(idsurat, nama, kelas, izin, duration); // membuat object surat08
                stackMain.push(surat); // masukkan object ke stack
                System.out.println("Surat berhasil dikumpulkan      : " + surat.namaMHS);
            }

            if (pilih == 2) {
                System.out.println("-----------------------------");
                System.out.println("======== PROSES SURAT =======");
                System.out.println("-----------------------------");
                System.out.println();
                boolean validasi;
                surat08 verifikasi = stackMain.pop(); // pop object dari stack
                if (verifikasi != null) {
                    System.out.println("Memverifikasi dari surat izin " + verifikasi.namaMHS);
                    System.out.println("-----------------------------");
                    System.out.print("Verifikasi surat izin (valid/invalid) : ");
                    String verif = galuh.nextLine();
                    if (verif.equalsIgnoreCase("valid")) {
                        validasi = true;
                        verifikasi.validate(validasi); 
                    }

                    System.out.println("Verifikasi " + verifikasi.namaMHS + " :" + verifikasi.valid); // verifikasi object

                } 
            }

            if (pilih == 3) {
                surat08 lihatterakhir = stackMain.peekakhir(); // memanggil method peek

                if (lihatterakhir != null) {
                    System.out.println("=================================");
                    System.out.println("Id Surat        : " + lihatterakhir.id_Surat);
                    System.out.println("Nama            : " + lihatterakhir.namaMHS);
                    System.out.println("Kelas           : " + lihatterakhir.kelas);
                    System.out.println("Jenis Izin      : " + lihatterakhir.jenisIzin);
                    System.out.println("Durasi          :"+ lihatterakhir.durasi);
                    System.out.println("=================================");
                } 
            }
            if (pilih == 4) {
                System.out.println("----------------------------");
                System.out.println("========= SEARCHING ========");
                System.out.println("----------------------------");
                System.out.println("");
                
                System.out.print("Masukkan Nama : ");
                String namadummy = galuh.nextLine();
                 System.out.println("----------------------------");
                stackMain.search(namadummy); // method sequential search
            }

            if (pilih > 4 || pilih < 0) {
                System.out.println("ERROR: Input Invalid!! Coba Lagi!!"); // kondisi input human error
                continue;
            }
            if (pilih == 0) { // keluar
                break;
            }

        } while (true);
        System.out.println("Berhasil Keluar!, Thank you for all your support!");
    }

}