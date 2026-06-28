import java.util.Scanner;

public class Binomial {
    public static int factorial(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomial_Coeff = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println(binomial_Coeff);
    }
}
