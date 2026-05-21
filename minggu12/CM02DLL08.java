package minggu12;

public class CM02DLL08 {

    // Linkedlist untuk antrian
    CM02Node08 headAntrian = null;
    CM02Node08 tailAntrian = null;

    // Linkedlist untuk laporan
    CM02Node08 headLaporan = null;
    CM02Node08 tailLaporan = null;

    // method isempty
    public boolean isAntrianEmpty() {
        return headAntrian == null;
    }

    public boolean isLaporanEmpty() {
        return headLaporan == null;
    }

    // iterasi untuk kode antrian pembeli otomatis
    int counterAntrian = 1;

    // FITUR 1: Tambah Antrean
    public void tambahAntrian(String nama, String noHp) {
        CM02Pembeli08 pembeliBaru = new CM02Pembeli08(counterAntrian, nama, noHp);
        CM02Pesanan08 pesananAwal = new CM02Pesanan08(0, "-", 0, pembeliBaru); // pembeli belum memesan sehingga objek
                                                                               // pesanan dibuat angka 0 dan - sebagai
                                                                               // default untuk
                                                                               // tanda belum memesan
        CM02Node08 newNode = new CM02Node08(pesananAwal);
        // memasukkan pembeli ke antrian linkedlist
        if (headAntrian == null) { // data awal head dan tail menjadi data objek pesanan berisi objek pembeli dan
                                   // bukan null
            headAntrian = tailAntrian = newNode;
        } else {
            tailAntrian.next = newNode;// memasukkan objek pesanan berisi objek pembeli baru ke dalam tail.next /
                                       // depannya tail
            newNode.prev = tailAntrian;// newNode sebelumnya mundur ke tail yang lama (belum diperbarui)
            tailAntrian = newNode;// memindahkan dan memperbarui tail ke newnode / tail.next atau depannya tail
                                  // sehingga tail tetap diujung
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
        counterAntrian++; // increment kode pembeli
    }

    // FITUR 2: Cetak Antrean
    public void cetakAntrian() {
        System.out.println("----------------------------------------------");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("----------------------------------------------");
        System.out.println("No Antrian" + "\t\t" + "Nama" + "\t\t\t" + "No HP");// format output

        if (isAntrianEmpty()) { // kondisi if empty
            System.out.println("(Antrean Kosong)");
            return;
        }

        CM02Node08 current = headAntrian;
        while (current != null) {

            CM02Pembeli08 p = current.data.pembeli; // Mengambil objek pembeli dari dalam objek pesanan
            System.out.println(p.noAntrian + "\t\t\t" + p.namaPembeli + "\t\t\t" + p.noHp);
            current = current.next; // memajukan pointer current untuk print objek berikutnya
        }
    }

    // FITUR 3: Hapus Antrean Terdepan dan Input Data Pesanan Ke Laporan
    public void hapusAntrianDanPesan(int kode, String namaMakanan, int harga) { // inputan pada main untuk pesanan
        if (isAntrianEmpty()) { // kondisi if empty
            System.out.println("Antrian kosong! Tidak ada pelanggan untuk dilayani.");
            return;
        }

        // Ambil data antrean terdepan (FIFO)
        CM02Node08 nodeDilayani = headAntrian;

        // Update data pesanan yang sebelumnya default
        nodeDilayani.data.kodePesanan = kode;
        nodeDilayani.data.namaPesanan = namaMakanan;
        nodeDilayani.data.harga = harga;

        System.out.println(nodeDilayani.data.pembeli.namaPembeli + " telah memesan " + namaMakanan);

        // memindahkan pesanan yang telah selesai dibuat kedalam laporan
        CM02Node08 nodeLaporanBaru = new CM02Node08(nodeDilayani.data);
        if (headLaporan == null) {// data awal head dan tail menjadi sama
            headLaporan = tailLaporan = nodeLaporanBaru;
        } else {
            tailLaporan.next = nodeLaporanBaru; // input data pesanan selesai kedalam depannya tail
            nodeLaporanBaru.prev = tailLaporan;// Node laporan sebelumnya mundur ke tail yang lama
            tailLaporan = nodeLaporanBaru;// memperbarui tail menjadi yang diujung / = taillaporan.next.
        }

        // kondisi penghapusan antrian pada linkedlist
        if (headAntrian == tailAntrian) {
            headAntrian = tailAntrian = null; // menghapus antrian terakhir bila tidak ada antrian lagi, antrian sisa 1
                                              // / head = tail
        } else {
            headAntrian = headAntrian.next;// update data head dengan data depannya head
            headAntrian.prev = null;// menghapus head previous
        }
    }

    // FITUR 4: Laporan Pesanan Tersorting Berdasarkan Nama Makanan (Sorting tipe
    // Bubble Sort)

    public void laporanPesanan() {
        System.out.println("----------------------------------------------");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("----------------------------------------------");
        System.out.println("Kode Pesanan" + "\t\t" + "Nama Pesanan" + "\t\t" + "Harga");

        if (isLaporanEmpty()) { // kondisi if empty
            System.out.println("(Belum ada laporan pesanan)");
            return;
        }

        // Hitung size data laporan pesanan untuk temporary array
        int size = 0;
        CM02Node08 temp = headLaporan;
        while (temp != null) {
            size++;
            temp = temp.next;// menghitung banyaknya index pada linkedlist pada laporan untuk determine
                             // jumlah array
        }

        // Menyalin data ke array temporary untuk disorting manual
        CM02Pesanan08[] arrTemp = new CM02Pesanan08[size];
        temp = headLaporan;
        for (int i = 0; i < size; i++) {
            arrTemp[i] = temp.data;// mengisi array dengan data laporan pesanan tiap linkedlist
            temp = temp.next;// pointer linkedlist laporan menuju kedepannya
        }

        // Sorting Manual Bubble Sort Ascending secara alphabet
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arrTemp[j].namaPesanan.compareToIgnoreCase(arrTemp[j + 1].namaPesanan) > 0) {// kondisi bubbleSort
                                                                                                 // CompareTo
                                                                                                 // mengcompare
                                                                                                 // alphabet, >0 kondisi
                                                                                                 // bila
                                                                                                 // alphabet arr[J] >
                                                                                                 // alphabet arr [J+1]
                    CM02Pesanan08 Tempo = arrTemp[j]; // arr j dimasukkan temp
                    arrTemp[j] = arrTemp[j + 1];// arr j di swap dengan arr j+1
                    arrTemp[j + 1] = Tempo;// arr j+1 dimasukkan temp, sehingga swap arr j dengan arr j+1 berhasil
                }
            }
        }

        // Cetak hasil urutan beserta total pendapatan
        int totalPendapatan = 0;
        for (int i = 0; i < size; i++) {
            System.out.println(
                    arrTemp[i].kodePesanan + "\t\t\t" + arrTemp[i].namaPesanan + "\t\t\t" + arrTemp[i].harga);
            totalPendapatan += arrTemp[i].harga;// menambah untuk totalpendapatan
        }

        System.out.println("----------------------------------------------");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan);
    }

}