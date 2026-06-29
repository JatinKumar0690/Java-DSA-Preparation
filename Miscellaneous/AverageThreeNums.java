import java.util.Scanner;

public class AverageThreeNums {
    public static int avg_three_nums(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average of three numbers will be " + avg_three_nums(a, b, c));
    }
}
