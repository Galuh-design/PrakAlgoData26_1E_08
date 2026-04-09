package CM1;

public class Peminjaman08 {
    Mahasiswa08 mhs[] = new Mahasiswa08[3];
    Mahasiswa08 maha = new Mahasiswa08();
    Buku08 book = new Buku08();
    Buku08 buku[] = new Buku08[4];
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;
    int intnim;
    //konstruktor default
    Peminjaman08() {
    }
    //konstruktor parameter
    Peminjaman08(Mahasiswa08 mhs, Buku08 buku, int lamaPinjam) {
        maha = mhs;
        book = buku;
        this.lamaPinjam = lamaPinjam;
    }

    Peminjaman08 pinjamin[] = new Peminjaman08[5];
    //method tampilPeminjaman
    void tampilPeminjaman() {
        System.out.println("Daftar Peminjaman:");
        for (int i = 0; i < pinjamin.length; i++) {
            System.out.print(pinjamin[i].maha.nama + " | ");
            System.out.print(pinjamin[i].book.judul + " | ");
            System.out.print("Lama: " + pinjamin[i].lamaPinjam + " | ");
            System.out.print("Terlambat: " + pinjamin[i].terlambat + " | ");
            System.out.print("Denda: " + pinjamin[i].denda);
            System.out.println();
        }

    }
    //method Sorting insertion
    void insertionSort() {
        for (int i = 1; i < pinjamin.length; i++) {
            Peminjaman08 temp = pinjamin[i];
            int j = i;
            while (j > 0 && pinjamin[j - 1].denda < temp.denda) {
                pinjamin[j] = pinjamin[j - 1];
                j--;
            }
            pinjamin[j] = temp;
        }
    }
    //method Binary Search
    void binarySearch(String Nim) {
        int nilaitengah = (0 + (pinjamin.length - 1) / 2);
        int Searchin = Integer.parseInt(Nim);
        int ditemukan = 0;
        for (int i = 0; i < pinjamin.length; i++) {
            pinjamin[i].intnim = Integer.parseInt(pinjamin[i].maha.nim);
        }
        int j = nilaitengah;
            while (j < pinjamin.length) {
                if (Searchin == pinjamin[j].intnim) {
                    System.out.print(pinjamin[j].maha.nama + " | ");
                    System.out.print(pinjamin[j].book.judul + " | ");
                    System.out.print("Lama: " + pinjamin[j].lamaPinjam + " | ");
                    System.out.print("Terlambat: " + pinjamin[j].terlambat + " | ");
                    System.out.print("Denda: " + pinjamin[j].denda);
                    System.out.println();
                    ditemukan++;
                }
                j++;
            }
        
            j = nilaitengah;
            j--;
            while (j >= 0) {
                if (Searchin == pinjamin[j].intnim) {
                    System.out.print(pinjamin[j].maha.nama + " | ");
                    System.out.print(pinjamin[j].book.judul + " | ");
                    System.out.print("Lama: " + pinjamin[j].lamaPinjam + " | ");
                    System.out.print("Terlambat: " + pinjamin[j].terlambat + " | ");
                    System.out.print("Denda: " + pinjamin[j].denda);
                    System.out.println();
                    ditemukan++;

                }
                j--;
            }


        if (ditemukan == 0) {
            System.out.println("Data NIM Tidak Ditemukan!");
        }

    }
    //method hitung denda
    void hitungdenda() {
        for (int i = 0; i < pinjamin.length; i++) {
            if (pinjamin[i].lamaPinjam > 5) {
                pinjamin[i].denda = (pinjamin[i].lamaPinjam - 5) * 2000;
                pinjamin[i].terlambat = pinjamin[i].lamaPinjam - 5;
            } else {
                pinjamin[i].denda = 0;
                pinjamin[i].terlambat = 0;
            }

        }
    }

    // Method Void untuk isi data
    void dataPinjam() {
        pinjamin[0] = new Peminjaman08(mhs[0], buku[0], 7);
        pinjamin[1] = new Peminjaman08(mhs[1], buku[1], 3);
        pinjamin[2] = new Peminjaman08(mhs[2], buku[2], 10);
        pinjamin[3] = new Peminjaman08(mhs[2], buku[3], 6);
        pinjamin[4] = new Peminjaman08(mhs[0], buku[1], 4);
    }

    void datasiswa() {
        mhs[0] = new Mahasiswa08("22001", "Andi", "Teknik Informatika");
        mhs[1] = new Mahasiswa08("22002", "Budi", "Teknik Informatika");
        mhs[2] = new Mahasiswa08("22003", "Citra", "Sistem Informasi Bisnis");
    }

    void databuku() {
        buku[0] = new Buku08("B001", "Algoritma", 2020);
        buku[1] = new Buku08("B002", "Basis Data", 2019);
        buku[2] = new Buku08("B003", "Pemrograman", 2021);
        buku[3] = new Buku08("B004", "Fisika", 2024);

    }

    // method Void untuk Output
    void tampilsiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < mhs.length; i++) {
            mhs[i].tampilMahasiswa();
            System.out.println();
        }
    }

    void tampilbuku() {
        System.out.println("Daftar Buku:");
        for (int i = 0; i < buku.length; i++) {
            buku[i].tampilBuku();
            System.out.println();
        }

    }

}