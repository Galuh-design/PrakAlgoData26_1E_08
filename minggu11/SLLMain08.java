package minggu11;

import java.util.Scanner;

public class SLLMain08 {
    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        SingleLinkedList08 sll = new SingleLinkedList08();
        // Mahasiswa08 mhs;
        // String Nim, nama, kelas, Dummy;
        // double ipk;

        // do {
        //     System.out.println("=== MENU ===");
        //     System.out.println("1. Add First");
        //     System.out.println("2. Add Last");
        //     System.out.println("3. Insert After");
        //     System.out.println("4. Insert At");
        //     System.out.println("0. Keluar");
        //     System.out.print("Pilih : ");
        //     Dummy = galuh.nextLine();
        //     int pilih = Integer.parseInt(Dummy);
        //     switch (pilih) {
        //         case 1:
        //             System.out.println("Masukkan NIM    : ");
        //             Nim = galuh.nextLine();
        //             System.out.println("Masukkan Nama   : ");
        //             nama = galuh.nextLine();
        //             System.out.println("Masukkan Kelas  : ");
        //             kelas = galuh.nextLine();
        //             System.out.println("Masukkan IPK    : ");
        //             Dummy = galuh.nextLine();
        //             ipk = Double.parseDouble(Dummy);
        //             mhs = new Mahasiswa08(Nim, nama, kelas, ipk);
        //             sll.addFirst(mhs);
        //             sll.print();
        //             break;

        //         case 2:
        //             System.out.println("Masukkan NIM    : ");
        //             Nim = galuh.nextLine();
        //             System.out.println("Masukkan Nama   : ");
        //             nama = galuh.nextLine();
        //             System.out.println("Masukkan Kelas  : ");
        //             kelas = galuh.nextLine();
        //             System.out.println("Masukkan IPK    : ");
        //             Dummy = galuh.nextLine();
        //             ipk = Double.parseDouble(Dummy);
        //             mhs = new Mahasiswa08(Nim, nama, kelas, ipk);
        //             sll.addLast(mhs);
        //             sll.print();
        //             break;

        //         case 3:
        //             System.out.println("Masukkan NIM    : ");
        //             Nim = galuh.nextLine();
        //             System.out.println("Masukkan Nama   : ");
        //             nama = galuh.nextLine();
        //             System.out.println("Masukkan Kelas  : ");
        //             kelas = galuh.nextLine();
        //             System.out.println("Masukkan IPK    : ");
        //             Dummy = galuh.nextLine();
        //             ipk = Double.parseDouble(Dummy);
        //             mhs = new Mahasiswa08(Nim, nama, kelas, ipk);
        //             System.out.print("Masukkan kata Kunci nama : ");
        //             String name = galuh.nextLine();
        //             sll.insertAfter(name, mhs);
        //             sll.print();
        //             break;

        //         case 4:
        //             System.out.println("Masukkan NIM    : ");
        //             Nim = galuh.nextLine();
        //             System.out.println("Masukkan Nama   : ");
        //             nama = galuh.nextLine();
        //             System.out.println("Masukkan Kelas  : ");
        //             kelas = galuh.nextLine();
        //             System.out.println("Masukkan IPK    : ");
        //             Dummy = galuh.nextLine();
        //             ipk = Double.parseDouble(Dummy);
        //             mhs = new Mahasiswa08(Nim, nama, kelas, ipk);
        //             System.out.print("Masukkan kata Kunci Index : ");
        //             Dummy = galuh.nextLine();
        //             int idx = Integer.parseInt(Dummy);
        //             sll.insertAt(idx, mhs);
        //             sll.print();
        //             break;

        //         default:
        //             break;
        //     }
        //     if (pilih == 0 || pilih < 0 || pilih > 4) {
        //         break;
        //     }

        // } while (true);
        // System.out.println("Berhasil Keluar.");

      

        Mahasiswa08 mhs1 = new Mahasiswa08("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa08 mhs2 = new Mahasiswa08("23212201", "Bimon", "2B", 3.8);
        Mahasiswa08 mhs3 = new Mahasiswa08("22212202", "Cintia", "3C", 3.5);
        Mahasiswa08 mhs4 = new Mahasiswa08("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);
        System.out.println();
        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }

}
