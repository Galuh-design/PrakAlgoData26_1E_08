package minggu6;

public class DataDosen08 {
    int input;

    Dosen08 dataDosen[] = new Dosen08[input];

    void importdata(Dosen08 imp[]) {
        dataDosen = imp;
    }

    void tampil() {
        for (Dosen08 tamp : dataDosen) {
            tamp.tampil();
            System.out.println("-------------------------");
        }

    }

    void bubble() { // ASC
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen08 temp = dataDosen[j - 1];
                    dataDosen[j - 1] = dataDosen[j];
                    dataDosen[j] = temp;
                }
            }
        }
    }

    void insertion() { // DESC
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen08 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }


}