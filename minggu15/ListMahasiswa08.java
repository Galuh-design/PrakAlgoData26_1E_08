package minggu15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa08 lm = new ListMahasiswa08();
        Mahasiswa08 m = new Mahasiswa08("201234", "Noureen", "021xx1");
        Mahasiswa08 m1 = new Mahasiswa08("201235", "Akhleema", "021xx2");
        Mahasiswa08 m2 = new Mahasiswa08("201236", "Shannum", "021xx3");

    
        lm.tambah(m, m1, m2);
        lm.tampil();

        int index = lm.linearSearch("201235");
        lm.update(index, new Mahasiswa08("201235", "Akhleema Lela", "021xx2"));
 
        System.out.println("");
        lm.tampil();
    }
}