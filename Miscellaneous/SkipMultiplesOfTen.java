import java.util.Scanner;

public class SkipMultiplesOfTen {
    public static void printNumbers() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("You entered " + n);
        }
    }

    public static void main(String args[]) {
        printNumbers();
    }
}