//Print Reverse of a Number

import java.util.Scanner;

public class Reverse {
    public static void reverseDigits(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseDigits(n);
    }
}
