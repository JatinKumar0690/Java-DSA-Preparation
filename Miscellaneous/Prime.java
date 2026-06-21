import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n, int div) {
        if (n<=1) {
            return false;
        }
        while (div < n) {
            if (n % div == 0) {
                return false;
            } else {
                div = div + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;
        System.out.println(isPrime(n, div));
        ;
    }
}
