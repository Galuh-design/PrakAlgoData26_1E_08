public class mataKuliahMain08 {
public static void main(String[] args) {
mataKuliah08 matkul1 = new mataKuliah08();
matkul1.kodeMK = "matDas"; 
matkul1.nama = "Galuh Pramudya";
matkul1.sks = 2;
matkul1.jumlahJam = 4;

matkul1.kurangJam(2);
if (matkul1.secure == 0) {
matkul1.tampilInformasi();
} 

mataKuliah08 matkul2 = new mataKuliah08("dasPro", "Galih MGS", 4, 4);
matkul2.tambahJam(3);
matkul2.ubahSKS(5);
if (matkul2.secure == 0) {
matkul2.tampilInformasi();
} 

}
    
}