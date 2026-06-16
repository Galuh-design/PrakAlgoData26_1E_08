package minggu15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SistemMain08 {
    public static List<tugasMHS08> listMahasiswa = new ArrayList<>();
    public static List<MataKuliah08> listMataKuliah = new ArrayList<>();
    public static List<Nilai08> listNilai = new ArrayList<>();
    public static Queue<tugasMHS08> queueHapusMhs = new LinkedList<>();

    public static void main(String[] args) {
        initDataMaster();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa Terdepan (Queue)");
            System.out.println("6. Keluar");
            System.out.println("*************************************************");
            System.out.print("Pilih : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    inputNilai(sc);
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa(sc);
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    hapusMahasiswaQueue();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
            System.out.println();
        } while (menu != 6);

        sc.close();
    }

    public static void initDataMaster() {
        listMahasiswa.add(new tugasMHS08("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new tugasMHS08("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new tugasMHS08("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new tugasMHS08("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new tugasMHS08("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new tugasMHS08("20006", "Ubaidah", "021xxx"));

        for (tugasMHS08 mhs : listMahasiswa) {
            queueHapusMhs.add(mhs);
        }

        listMataKuliah.add(new MataKuliah08("00001", "Internet of Things", 3));
        listMataKuliah.add(new MataKuliah08("00002", "Algoritma dan Struktur Data", 2));
        listMataKuliah.add(new MataKuliah08("00003", "Algoritma dan Pemrograman", 2));
        listMataKuliah.add(new MataKuliah08("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMataKuliah.add(new MataKuliah08("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public static void inputNilai(Scanner sc) {
        System.out.println("Masukkan data");
        System.out.print("Kode : ");
        String kodeNilai = sc.nextLine();
        System.out.print("Nilai : ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("*******");
        System.out.printf("%-10s %-15s %-10s\n", "NIM", "Nama", "Telf");
        for (tugasMHS08 mhs : listMahasiswa) {
            System.out.printf("%-10s %-15s %-10s\n", mhs.nim, mhs.nama, mhs.telf);
        }

        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.nextLine();
        tugasMHS08 selectedMhs = null;
        for (tugasMHS08 mhs : listMahasiswa) {
            if (mhs.nim.equals(nim)) {
                selectedMhs = mhs;
                break;
            }
        }

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("*******");
        System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah08 mk : listMataKuliah) {
            System.out.printf("%-10s %-40s %-5d\n", mk.kode, mk.namaMk, mk.sks);
        }

        System.out.print("Pilih MK by kode: ");
        String kodeMk = sc.nextLine();
        MataKuliah08 selectedMk = null;
        for (MataKuliah08 mk : listMataKuliah) {
            if (mk.kode.equals(kodeMk)) {
                selectedMk = mk;
                break;
            }
        }

        if (selectedMhs != null && selectedMk != null) {
            listNilai.add(new Nilai08(selectedMhs, selectedMk, nilai));
            System.out.println("Data nilai berhasil ditambahkan.");
        } else {
            System.out.println("NIM Mahasiswa atau Kode Mata Kuliah tidak ditemukan!");
        }
    }

    public static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*******");
        System.out.printf("%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai08 n : listNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
        }
    }

    public static void cariNilaiMahasiswa(Scanner sc) {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("***");
        System.out.print("Masukkan data mahasiswa [nim] : ");
        String nim = sc.nextLine();

        System.out.printf("%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int totalSks = 0;
        boolean ditemukan = false;

        for (Nilai08 n : listNilai) {
            if (n.mhs.nim.equals(nim)) {
                System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                    n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                totalSks += n.mk.sks;
                ditemukan = true;
            }
        }

        if (ditemukan) {
            System.out.println("Total SKS " + totalSks + " telah diambil.");
        } else {
            System.out.println("Data nilai mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public static void urutDataNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("******");
        
        Collections.sort(listNilai, new Comparator<Nilai08>() {
            @Override
            public int compare(Nilai08 n1, Nilai08 n2) {
                return Double.compare(n1.nilai, n2.nilai);
            }
        });

        System.out.printf("%-10s %-15s %-40s %-6s %-5s\n", "Nim", "Nama", "Mata Kuliah", "Nilai", "SKS");
        for (Nilai08 n : listNilai) {
            System.out.printf("%-10s %-15s %-40s %-6.2f %-5d\n", 
                n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.nilai, n.mk.sks);
        }
    }

    public static void hapusMahasiswaQueue() {
        System.out.println("PENGHAPUSAN MAHASISWA DENGAN QUEUE");
        System.out.println("******");
        if (!queueHapusMhs.isEmpty()) {
            tugasMHS08 mhsDihapus = queueHapusMhs.poll();
            listMahasiswa.remove(mhsDihapus);
            
            listNilai.removeIf(nilai -> nilai.mhs.nim.equals(mhsDihapus.nim));
            
            System.out.println("Mahasiswa " + mhsDihapus.nama + " [NIM: " + mhsDihapus.nim + "] terdepan berhasil dihapus dari antrean.");
        } else {
            System.out.println("Antrean mahasiswa sudah kosong!");
        }
    }
}