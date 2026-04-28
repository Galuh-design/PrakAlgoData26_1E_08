package minggu9;

public class surat08 {
    String id_Surat; // data
    String namaMHS;
    String kelas;
    char jenisIzin;
    int durasi;
    boolean valid;

    public surat08() {// konstruktor default
    }

    public surat08(String id_Surat, String namaMHS, // konstruktor berparameter
            String kelas, char jenisIzin, int durasi) {
        this.id_Surat = id_Surat;
        this.namaMHS = namaMHS;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
        this.valid = false;
    }

    void validate(boolean valid){//method validasi surat
        this.valid = valid;
    }
}