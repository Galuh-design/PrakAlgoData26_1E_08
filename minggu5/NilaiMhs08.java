package minggu5;

public class NilaiMhs08 {
    String nama;
    String nim;
    int thMasuk;
    int uts;
    int uas;

    public NilaiMhs08() {
    }

    public NilaiMhs08(String nama, String nim, int thMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.thMasuk = thMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    // a. Divide&Conquer nilai Max UTS
    public static NilaiMhs08 MaxutsDC(NilaiMhs08[] arruts, int iMin, int iMax) {

        if (iMin == iMax) {
            return arruts[iMin];
        }

        int mid = (iMin + iMax) / 2;
        NilaiMhs08 lsum = MaxutsDC(arruts, iMin, mid);
        NilaiMhs08 rsum = MaxutsDC(arruts, mid + 1, iMax);
        if (lsum.uts > rsum.uts) {
            return lsum;
        } else {
            return rsum;
        }
    }

    // b. Divide&Conquer nilai Min UTS
    public static NilaiMhs08 MinutsDC(NilaiMhs08[] arruts, int iMin, int iMax) {

        if (iMin == iMax) {
            return arruts[iMin];
        }

        int mid = (iMin + iMax) / 2;
        NilaiMhs08 lsum = MinutsDC(arruts, iMin, mid);
        NilaiMhs08 rsum = MinutsDC(arruts, mid + 1, iMax);
        if (lsum.uts < rsum.uts) {
            return lsum;
        } else {
            return rsum;
        }
    }

    // c. BruteForce Rata rata UAS 
    double rataUasBF(int rata[], int jmlsiswa) {
        double total = 0;
        for (int i = 0; i < jmlsiswa; i++) {
            total = total + (double) rata[i];
        }
        total = total / jmlsiswa;
        return total;

    }

}