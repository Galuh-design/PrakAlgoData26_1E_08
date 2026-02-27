package minggu3;
public class DataDosen08 {

    // a. Data semua Dosen.
    public void dataSemuaDosen(Dosen08[] arrayOfDosen) {
        
        System.out.println("===============================");
        System.out.println("       DATA SELURUH DOSEN      ");
        System.out.println("===============================");
        
        int no = 1;
        for (Dosen08 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.print("Jenis Kelamin : ");
            if (dosen.jenisKelamin == true) {
                System.out.print("Pria");
                System.out.println();
            } else {
                System.out.print("Wanita");
                System.out.println();
            }
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("-------------------------------");
            no++;
        }
    }

    // b. Jumlah Dosen / Kelamin.
    public void jumlahDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true)
                pria++;
            else
                wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    // c. Rerata Usia.
    public void rerataUsiaDosenPerJenisKelamin(Dosen08[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, jmlPria = 0, jmlWanita = 0;
        double rerataPria, rerataWanita;
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                totalPria += dosen.usia;
                jmlPria++;

            } else {
                totalWanita += dosen.usia;
                jmlWanita++;
            }
        }
        if (jmlPria > 0) {
        rerataPria = (double) totalPria / jmlPria;
        System.out.println("Rerata Usia Pria   : " + rerataPria);
    } else {
        System.out.println("Rerata Usia Pria   : 0.0");
    }

    
    if (jmlWanita > 0) {
        rerataWanita = (double) totalWanita / jmlWanita;
        System.out.println("Rerata Usia Wanita : " + rerataWanita);
    } else {
        System.out.println("Rerata Usia Wanita : 0.0");
    }
    }

    // d. Dosen paling tua
    public void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 tua = arrayOfDosen[0];
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia > tua.usia)
                tua = dosen;
        }
        System.out.println("Dosen Paling Tua   : " + tua.nama + " (" + tua.usia + " Tahun)");
    }

    // e. Dosen paling muda
    public void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 muda = arrayOfDosen[0];
        for (Dosen08 dosen : arrayOfDosen) {
            if (dosen.usia < muda.usia)
                muda = dosen;
        }
        System.out.println("Dosen Paling Muda  : " + muda.nama + " (" + muda.usia + " tahun)");
    }
}