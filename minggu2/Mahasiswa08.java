import java.util.Scanner;
public class Mahasiswa08 {
    String nama;
    String nim;
    String kelas;
    double ipk;
public static Scanner galuh = new Scanner(System.in);
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK" + ipk);
        System.out.println("Kelas: " + kelas);
   }
   void ubahKelas(String kelasBaru){
    kelas = kelasBaru;
   }
   void updateIpk(double ipkBaru){
    do {
    System.out.print("input ipk: ");    
    ipkBaru = galuh.nextDouble();
    if (ipkBaru <= 0.0 || ipkBaru >= 4.0) {
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    } else {
        ipk = ipkBaru;
        break;
    }
    } while (true);
   }
   String nilaiKinerja(){
    if (ipk >= 3.5) {
        return "kinerja sangat baik";
    } else if (ipk >= 3.0) {
        return "Kinerja baik";
    } else if (ipk >= 2.0) {
        return "Kinerja Cukup";
    } else {
        return "Kinerja kurang";
    }
///
   }

}