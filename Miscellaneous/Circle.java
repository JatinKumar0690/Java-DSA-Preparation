import java.util.Scanner;

public class Circle {
    public static int areaOfCircle(int r) {
        return (int) Math.PI * r * r;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("The area of circle would be approx " + areaOfCircle(r));
        ;
    }
}