import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int n) {
        int binary = 0;
        int pow = 0;
        int myNum = n;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + (int) (Math.pow(10, pow) * rem);
            n = n / 2;
            pow++;
        }
        System.out.println("The binary number of " + myNum + " would be " + binary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBin(n);
        sc.close();
    }
}
