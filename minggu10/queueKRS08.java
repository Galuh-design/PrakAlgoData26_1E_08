package minggu10;

public class queueKRS08 {
    mahasiswa_08[] antrian;
    int front, rear, size, max;
    int totalSelesaiKRS = 0;

    public queueKRS08(int n) {
        max = n;
        antrian = new mahasiswa_08[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(mahasiswa_08 mhs) { // memasukkan input dari main ke array of object antrian
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    public void prosesKRS() { // mengeluarkan index terdepan (front)
        if (size >= 2) {
            for (int i = 0; i < 2; i++) {
                mahasiswa_08 m = antrian[front];
                System.out.println("Memproses KRS: " + m.nama);
                front = (front + 1) % max;
                size--;
                totalSelesaiKRS++;
            }
        } else {
            System.out.println("harus ada minimal 2 mahasiswa dalam antrian untuk diproses.");
        }
    }

    public void tampilkanSemua() { // menampilkan semua data yang terdapat dalam queue
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                antrian[(front + i) % max].tampilkanData();
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void lihat2Terdepan() { // melihat 2 data queue terdepan
        if (size >= 2) {
            System.out.println("2 Antrian Terdepan:");
            antrian[front].tampilkanData();
            antrian[(front + 1) % max].tampilkanData();
        } else {
            System.out.println("Jumlah mahasiswa kurang dari 2.");
        }
    }

    public void lihatAkhir() { // melihat data paling akhir dimasukkan
        if (!isEmpty()) {
            System.out.print("Antrian Paling Akhir: ");
            antrian[rear].tampilkanData();
        }
    }

    public void cetakStatus() { // melihat status dari data siswa yang belum KRS
        System.out.println("Jumlah dalam antrian saat ini: " + size);
        System.out.println("Mahasiswa sudah selesai KRS: " + totalSelesaiKRS);
        int KUOTA_DPA = 30;
        System.out.println("Mahasiswa belum diproses DPA (dari kuota 30): " + (KUOTA_DPA - totalSelesaiKRS));
    }

    public void clear() { //membersihkan queue
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

}