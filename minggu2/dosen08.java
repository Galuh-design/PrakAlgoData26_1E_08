public class dosen08 {
String idDosen;
String nama;
Boolean statusAktif;
int tahunBergabung;
String bidangKeahlian;
int tahunnow = 2026;

void tampilInformasi(){
System.out.println("ID Dosen            : "+idDosen);
System.out.println("Nama                : "+nama);
System.out.println("Status              : "+setStatusAktif(statusAktif));
System.out.println("Tahun Bergabung     : "+tahunBergabung);
System.out.println("Bidang Keahlian     : "+bidangKeahlian);
System.out.println("Masa Kerja          : "+hitungMasaKerja(tahunnow)+" Tahun");
System.out.println("===============================");
}

String setStatusAktif(Boolean status){
statusAktif = status;

    if (status == true) {
    return "Aktif";
} else {
    return "Tidak Aktif";
}
}

int hitungMasaKerja (int thnSkrg){
thnSkrg -= tahunBergabung;
return thnSkrg;
}
void ubahKeahlian (String bidang){
    bidangKeahlian = bidang;
} 
public dosen08(){    
}
public dosen08 (String idDosen, String nama, Boolean status, int tahun, String bidang){
this.idDosen = idDosen;
this.nama = nama;
statusAktif = status;
tahunBergabung = tahun;
bidangKeahlian = bidang;
}


}