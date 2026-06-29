import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Loop for printing space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverted_rotated_half_pyramid(n);
        sc.close();
    }
}
