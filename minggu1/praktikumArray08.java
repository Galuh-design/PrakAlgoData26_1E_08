import java.util.Scanner;

public class praktikumArray08 {
    public static Scanner galuh = new Scanner(System.in);
    public static String matkul08[] = { "Pancasila", "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving", "Matematika Dasar",
            "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja" };
    public static String nilaiHuruf08[] = { "E", "E", "E", "E", "E", "E", "E", "E" };
    public static double bobotnil[] = new double[matkul08.length];
    public static double nilaimatkul[] = new double[matkul08.length];
    public static int sks[] = { 2, 2, 2, 3, 2, 2, 3, 2 };

    static void fungsiInput() {
        for (int i = 0; i < bobotnil.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul08[i] + ": ");
            nilaimatkul[i] = galuh.nextDouble();
            if (nilaimatkul[i] > 100 || nilaimatkul[i] < 0) {
                System.out.println("INVALID");
                i--;
                continue;
            }
        }

    }

    static void fungsiHuruf() {
        for (int i = 0; i < bobotnil.length; i++) {
            if (nilaimatkul[i] > 80) {
                nilaiHuruf08[i] = "A";
                bobotnil[i] = 4.00;
            } else if (nilaimatkul[i] > 73) {
                nilaiHuruf08[i] = "B+";
                bobotnil[i] = 3.50;
            } else if (nilaimatkul[i] > 65) {
                nilaiHuruf08[i] = "B";
                bobotnil[i] = 3.00;
            } else if (nilaimatkul[i] > 60) {
                nilaiHuruf08[i] = "C+";
                bobotnil[i] = 2.50;
            } else if (nilaimatkul[i] > 50) {
                nilaiHuruf08[i] = "C";
                bobotnil[i] = 2.00;
            } else if (nilaimatkul[i] > 39) {
                nilaiHuruf08[i] = "D";
                bobotnil[i] = 1.00;
            } else {
                bobotnil[i] = 0.00;
            }
        }

    }

    static double fungsiIP() {
        double totalnilai = 0;
        double totalsks = 0;
        for (int i = 0; i < bobotnil.length; i++) {
            double nilaiBB = bobotnil[i] * sks[i];
            totalnilai += nilaiBB;
            totalsks += sks[i];
        }
        double ip = totalnilai / totalsks;
        return ip;  

    }

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        fungsiInput();
        fungsiHuruf();
        fungsiIP();
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("%-45s", "MK");
        System.out.printf("%-20s", "Nilai Angka");
        System.out.printf("%-20s", "Nilai Huruf");
        System.out.printf("%-20s", "Bobot Nilai");
        System.out.println();
        for (int i = 0; i < matkul08.length; i++) {
            System.out.printf("%-45s", matkul08[i]);
            System.out.printf("%-20s", nilaimatkul[i]);
            System.out.printf("%-20s", nilaiHuruf08[i]);
            System.out.print(bobotnil[i]);
            System.out.print("0");
            System.out.println();
        }
        System.out.println("======================");
        System.out.println("IP :"+fungsiIP());
    }
}
