public class mataKuliah08 {
String kodeMK;
String nama;
int sks,jumlahJam;
int secure;

void tampilInformasi(){
System.out.println("Mata kuliah : "+kodeMK);
System.out.println("nama : "+nama);
System.out.println("SKS : "+sks);
System.out.println("jumlah jam : "+jumlahJam);
}

void tambahJam (int jam){
    jumlahJam += jam;
}
void kurangJam (int jam){
    if (jam >= jumlahJam) {
        System.out.println("INVALID, jumlah jam yang dikurangi terlalu banyak!");
        secure = 1;
    } else {
    
    jumlahJam -= jam;
    System.out.println("U P D A T E D | Jam ="+jumlahJam);
    secure = 0;
    }
}
void ubahSKS (int ubSkS){
    sks = ubSkS;
    System.out.println("U P D A T E D | SKS telah diubah!");
}
public mataKuliah08(){    
}
public mataKuliah08(String kodeMatkul,String nm,int SKS, int jmlJam){
    kodeMK = kodeMatkul;
    nama = nm;
    sks = SKS;
    jumlahJam = jmlJam;
}

}