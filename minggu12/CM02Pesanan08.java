package minggu12;

public class CM02Pesanan08 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    CM02Pembeli08 pembeli; //mengambil objek data pembeli

    public CM02Pesanan08(int kodePesanan, String namaPesanan, int harga, CM02Pembeli08 pembeli) { //blueprint data pesanan milik pembeli
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.pembeli = pembeli;
    }
}