import java.util.Scanner;

public class konsepDasarPemrograman08 {
//PEMILIHAN
    public static Scanner galuh = new Scanner(System.in);

    static double keseluruhanNilai08(int tugas, int kuis, int uts, int uas) {
        double konversiTugas = tugas * 0.2;
        double konversiKuis = kuis * 0.2;
        double konversiuts = uts * 0.3;
        double konversiuas = uas * 0.3;
        double keseluruhanNilaikonvers = konversiTugas + konversiKuis + konversiuts + konversiuas;
        if (keseluruhanNilaikonvers > 100) {
            keseluruhanNilaikonvers = 100;
        }
        return keseluruhanNilaikonvers;
    }

    static String huruf08(double nilselru) {
        String huruf = "E";
        if (nilselru > 80) {
            huruf = "A";
        } else if (nilselru > 73) {
            huruf = "B+";
        } else if (nilselru > 65) {
            huruf = "B";
        } else if (nilselru > 60) {
            huruf = "C+";
        } else if (nilselru > 50) {
            huruf = "C";
        } else if (nilselru > 39) {
            huruf = "D";
        }
        return huruf;
    }

    public static void main(String[] args) {
        int tugas08, kuis08, uas08, uts08;
        do {
            System.out.println("Program Menghitung Nilai Akhir");
            System.out.println("======================");
            System.out.print("Masukkan Nilai Tugas: ");
            tugas08 = galuh.nextInt();
            System.out.print("Masukkan Nilai Kuis: ");
            kuis08 = galuh.nextInt();
            System.out.print("Masukkan Nilai UTS: ");
            uts08 = galuh.nextInt();
            System.out.print("Masukkan Nilai UAS: ");
            uas08 = galuh.nextInt();
            System.out.println("======================");
            System.out.println("======================");
            if (tugas08 > 100 || tugas08 < 0 || kuis08 > 100 || kuis08 < 0 || uts08 > 100 || uts08 < 0 || uas08 > 100
                    || uas08 < 0) {
                System.out.println("nilai tidak valid");
                System.out.println("======================");
                System.out.println("======================");
            } else {
                break;
            }
        } while (true);
        keseluruhanNilai08(tugas08, kuis08, uts08, uas08);
        double seluruhnil08 = keseluruhanNilai08(tugas08, kuis08, uts08, uas08);
        huruf08(seluruhnil08);
        System.out.println("nilai akhir : " + seluruhnil08);
        System.out.println("nilai huruf : " + huruf08(seluruhnil08));
        System.out.println("======================");
        System.out.println("======================");
        if (seluruhnil08 <= 50.0) {
        System.out.println("TIDAK LULUS");
        } else {
        System.out.println("SELAMAT ANDA LULUS");
        }
    }
}
