import java.util.Scanner;

public class Butterfly {
    public static void butterfly_pattern(int n) {
        //First Half
        for(int i=1; i<=n; i++) {
            //Loop for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //Loop for spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //Loop for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Half
        for(int i=n; i>=1; i--) {
            //Loop for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            //Loop for spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //Loop for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        butterfly_pattern(n);
        sc.close();
    }
}