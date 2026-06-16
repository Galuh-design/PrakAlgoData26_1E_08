package minggu15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class ListMahasiswa08 {
    List<Mahasiswa08> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa08... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        if (index >= 0 && index < mahasiswas.size()) {
            mahasiswas.remove(index);
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void update(int index, Mahasiswa08 mhs) {
        if (index >= 0 && index < mahasiswas.size()) {
            mahasiswas.set(index, mhs);
        } else {
            System.out.println("Index tidak valid!");
        }
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    int binarySearch(String nim) {

        Collections.sort(mahasiswas, new Comparator<Mahasiswa08>() {
            @Override
            public int compare(Mahasiswa08 m1, Mahasiswa08 m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });

        Mahasiswa08 dummy = new Mahasiswa08(nim, "", "");

        return Collections.binarySearch(mahasiswas, dummy, new Comparator<Mahasiswa08>() {
            @Override
            public int compare(Mahasiswa08 m1, Mahasiswa08 m2) {
                return m1.nim.compareTo(m2.nim);
            }
        });
    }

    public void sortByNimAsc() {
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortByNimDesc() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa08 lm = new ListMahasiswa08();
        Mahasiswa08 m = new Mahasiswa08("201234", "Noureen", "021xx1");
        Mahasiswa08 m1 = new Mahasiswa08("201235", "Akhleema", "021xx2");
        Mahasiswa08 m2 = new Mahasiswa08("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();

        int index = lm.binarySearch("201236");
        System.out.println("indexbinary=" + index);
        lm.update(index, new Mahasiswa08("201235", "Akhleema Lela", "021xx2"));

        System.out.println("");
        lm.tampil();

        System.out.println("Sort ASC");
        lm.sortByNimAsc();
        lm.tampil();

         System.out.println("Sort DSC");
        lm.sortByNimDesc();
        lm.tampil();
    }
}