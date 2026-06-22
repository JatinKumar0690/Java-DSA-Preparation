import java.util.Scanner;

public class NaturalNum {
    public static int sum_first_natural_num(int n) {
        int val = 1;
        int sum = 0;
        while (val <= n) {
            sum += val;
            val++;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of first " + n + " natural numbers will be " + sum_first_natural_num(n));
    }
}
