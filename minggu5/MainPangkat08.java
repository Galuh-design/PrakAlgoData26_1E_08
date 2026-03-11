package minggu5;

import java.util.Scanner;

public class MainPangkat08 {
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = galuh.nextInt();

        Pangkat08[] png = new Pangkat08[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = galuh.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = galuh.nextInt();
            png[i] = new Pangkat08(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat08 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }

}