import java.util.Scanner;

public class TenMultiplesStop {
    public static void checkMultiples() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number");
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 5 == 0) {
                System.out.println("You entered a valid number congrats !");
                break;
            } else {
                System.out.println("Enter a valid number again");
                n = sc.nextInt();
            }
        }
    }

    public static void main(String args[]) {
        checkMultiples();
    }
}