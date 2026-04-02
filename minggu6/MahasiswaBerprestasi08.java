package minggu6;

public class MahasiswaBerprestasi08 {
    public int input;

    Mahasiswa08[] listMhs = new Mahasiswa08[input];
    int idx = 0;

    void tambah(Mahasiswa08 m[]) {
        listMhs = m;
    }

    void tampil() {
        for (Mahasiswa08 m : listMhs) {
            m.tampilInformasi();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa08 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }

    }
}