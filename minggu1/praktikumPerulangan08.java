import java.util.Scanner;

public class praktikumPerulangan08 {

    public static void main(String[] args) {
        Scanner galuh = new Scanner(System.in);
        // NIM 254107020127
        int n08;
        do {
            System.out.print("input 2 digit terakhir NIM: ");
            n08 = galuh.nextInt();
            if (n08 > 99 || n08 < 0) {
                System.out.println("invalid");
            } else {
                break;
            }
        } while (true);
        if (n08 < 10) {
            n08 += 10;
        }
        int k = 2, l = 3;
        for (int i = 1; i <= n08; i++) {
            if (i == 10) {
                k +=2;
                continue;
            }if (i == 15) {
                l +=3;
                continue;
            }
            if (l == k) {
                k += 2;
            }
            if (i == l) {
                System.out.print(" # ");
                l += 3;
            } else if (i == k) {
                System.out.print(" " + k + " ");
                k += 2;
            } else {
                System.out.print(" * ");
            }
        }
    }
}