package minggu3;
import java.util.Scanner;
public class Matakuliah08 {
    public String kode;
    public String nama;
    String dummy;
    public int sks, jumlahJam;
    public int iNO = 1;
    public int iN2 = 1;
    Scanner galuh = new Scanner(System.in);
    
    
    public void tambahData (){
        System.out.println("Masukkan Data MataKuliah ke-" +iNO);
            System.out.print("Kode        :   ");
            kode = galuh.nextLine();
            System.out.print("Nama        :   ");
            nama = galuh.nextLine();
            System.out.print("Sks         :   ");
            dummy = galuh.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  :   ");
            dummy = galuh.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------");
            iNO +=1;

    }

    public void cetakInfo (String KODE, String NAMA, int SKS, int JUMLAH){
     System.out.println("Data Matakuliah ke-" +iN2 );
        System.out.println("Kode        :"+KODE);
        System.out.println("Nama        :"+NAMA);
        System.out.println("SKS         :"+SKS);
        System.out.println("Jumlah Jam  :"+JUMLAH);
        System.out.println("-----------------------");
        iN2 +=1;
    }



    public Matakuliah08(){}
    public Matakuliah08(String kode, String nama, int sks, int jumlahJam) {
        
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
}