import java.util.Scanner;

public class PalindromicNumbers {
    public static void palindromic_number_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Numbers Descending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Numbers Ascending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindromic_number_pattern(n);
        sc.close();
    }
}
