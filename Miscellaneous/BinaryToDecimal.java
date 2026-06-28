import java.util.Scanner;

public class BinaryToDecimal {
    public static void binToDec(int n) {
        int pow = 0;
        int decimal = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            decimal = decimal + (int) (lastDigit * Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binToDec(n);
    }
}