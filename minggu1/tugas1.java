import java.util.Scanner;

public class tugas1 {
    public static Scanner galuh = new Scanner(System.in);
    public static char kode[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
    public static char kota[][] = { { 'B', 'A', 'N', 'T', 'E', 'N' },
            { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
            { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
            { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
            { 'B', 'O', 'G', 'O', 'R' },
            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
            { 'M', 'A', 'L', 'A', 'N', 'G' },
            { 'T', 'E', 'G', 'A', 'L' } };

    public static void main(String[] args) {
        do {
        System.out.print("Input kode plat mobil :");
        char kodemobil = galuh.next().charAt(0);
        for (int i = 0; i < kode.length; i++) {
           if (kodemobil == kode[i]) {
            for (int j = 0; j < kota[i].length ; j++) {
                System.out.print(kota[i][j]);
                if (kota[i][j] == 0) {
                    break;
                }
            }
            System.out.println();
        } 
        }
        System.out.print("Imput lagi? (y/n) :");
        String inputlg = galuh.nextLine();
        String inputlgincase = galuh.nextLine();
        if (inputlgincase.equalsIgnoreCase("n")) {
            break;
        }
        } while (true);
    }
}