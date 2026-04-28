package minggu9;

import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(5);
        Scanner galuh = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Jumlah Data Tugas Mahasiswa yang Terkumpul");
            System.out.print("Pilih: ");
            pilih = galuh.nextInt();
            galuh.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = galuh.nextLine();
                    System.out.print("NIM  : ");
                    String nim = galuh.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = galuh.nextLine();
                    Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = galuh.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa08 lihatatas = stack.peekatas();
                    Mahasiswa08 lihatbawah = stack.peekbawah();
                    if (lihatatas != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihatatas.nama);
                    }
                    if (lihatbawah != null) {
                        System.out.println("Tugas terawal dikumpulkan oleh " + lihatbawah.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    int total = stack.top + 1;
                    System.out.println("Jumlah seluruh data tugas mahasiswa yang terkumpul: " + total);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 5);

    }
}