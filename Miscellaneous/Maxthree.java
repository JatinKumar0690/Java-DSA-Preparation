import java.util.Scanner;

public class Maxthree {
    public static int max_three_numbers (int a, int b, int c) {
        if (a>=b && a>=c) {
            return a;
        } else if (b>=a && b>=c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The maximum of three Numbers will be " + max_three_numbers(a, b, c));
    }
}