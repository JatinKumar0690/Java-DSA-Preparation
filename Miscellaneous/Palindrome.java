import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int palindrome = 0;
        int originalN = n;
        while (n > 0) {
            int lastDigit = n % 10;
            palindrome = (palindrome * 10) + lastDigit;
            n = n / 10;
        }
        return originalN == palindrome;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}
