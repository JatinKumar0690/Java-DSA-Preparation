import java.util.Scanner;

public class ITCalculator {
    public static void Income_Tax_Calculator(int Your_Income) {
        int Tax;
        if (Your_Income <= 500000) {
            System.out.println("As per your income you will be taxed 0 %");
        } else if (Your_Income > 500000 && Your_Income <= 1000000) {
            Tax = Your_Income * 2 / 10;
            System.out.println("As per your income you will be taxed " + Tax);
        } else {
            Tax = Your_Income * 3 / 10;
            System.out.println("As per your income you will be taxed " + Tax);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Your_Income = sc.nextInt();
        Income_Tax_Calculator(Your_Income);
    }
}
