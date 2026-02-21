public class dosenmain08 {
public static void main(String[] args) {
dosen08 galuh1 = new dosen08();
galuh1.idDosen = "1212162727";
galuh1.nama = "Ocelot";
galuh1.statusAktif = false;
galuh1.tahunBergabung = 2000;
galuh1.bidangKeahlian = "Fisika";
galuh1.setStatusAktif(true);
galuh1.ubahKeahlian("Hypnotherapy");
galuh1.tampilInformasi();

dosen08 galuh2 = new dosen08("27276767", "Galih", true, 1880, "Tata Boga");
galuh2.ubahKeahlian("Dasar Pemrograman");
galuh2.setStatusAktif(false);
galuh2.tampilInformasi();
}
    
}