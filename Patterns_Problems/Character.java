import java.util.Scanner;

public class Character {
    public static void characterPattern(int n) {
        char chars = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(chars);
                chars++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        characterPattern(n);
    }
}