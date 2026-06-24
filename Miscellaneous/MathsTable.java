import java.util.Scanner;

public class MathsTable {
    public static void Table_N(int n) {
        int fac;
        for(int i=1; i<=10; i++) {
            fac = n * i;
            System.out.println(n + " * " + i + " = " + fac);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Table_N(n);
    }
}
