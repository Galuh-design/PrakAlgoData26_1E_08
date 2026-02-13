import java.util.Scanner;

public class tugas2 {
    public static Scanner galuhint = new Scanner(System.in);
    public static Scanner galuhstring = new Scanner(System.in);
    public static String judul[] = { "Matkul", "Ruang", "Hari", "Jam" };

    static String imputjadwal(String jadwaltukimput[][])[][] {

        for (int i = 0; i < jadwaltukimput.length; i++) {
            for (int j = 0; j < jadwaltukimput[i].length; j++) {
                int no = i + 1;
                System.out.print("Input " + judul[j] + " " + no + " : ");
                jadwaltukimput[i][j] = galuhstring.nextLine();
            }
        }
        return jadwaltukimput;
    }

    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.print("Masukkan jumlah jadwal kuliah :");
        int jadwalkuliah = galuhint.nextInt();
        String jadwal[][] = new String[jadwalkuliah][4];

        do {

            System.out.println("=======================");
            System.out.println("1. Input jadwal kuliah");
            System.out.println("2. Menampilkan seluruh jadwal kuliah");
            System.out.println("3. Menampilkan secara spesifik");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu: ");
            int menu = galuhint.nextInt();
            if (menu == 1) {
                jadwal = imputjadwal(jadwal);
            }
            if (menu == 2) {
                System.out.println("=======================");
                System.out.println("       MATA KULIAH     ");
                System.out.println("=======================");
                for (int i = 0; i < judul.length; i++) {
                    System.out.printf("%-30s", judul[i]);

                }
                System.out.println();
                for (int i = 0; i < jadwal.length; i++) {
                    for (int j = 0; j < jadwal[i].length; j++) {
                        System.out.printf("%-30s", jadwal[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            if (menu == 3) {
                System.out.print("Cari Matkul/Hari : ");
                String search = galuhstring.nextLine();

                System.out.println("=======================");
                System.out.println("       MATA KULIAH     ");
                System.out.println("=======================");
                for (int i = 0; i < judul.length; i++) {
                    System.out.printf("%-30s", judul[i]);
                }
                System.out.println();
                for (int i = 0; i < jadwal.length; i++) {
                    for (int j = 0; j < jadwal[i].length; j++) {
                        if (jadwal[i][j].equalsIgnoreCase(search)) {
                            for (int k = 0; k < jadwal[i].length; k++) {
                                System.out.printf("%-30s", jadwal[i][k]);
                            }

                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }

            if (menu < 1 || menu > 4) {
                System.out.println("INVALID COBA LAGI!");
            }
            if (menu == 4) {
                break;
            }
        } while (true);
    }

}