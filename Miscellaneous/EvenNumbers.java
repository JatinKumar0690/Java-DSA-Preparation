public class EvenNumbers {
    public static void printEvens(int start, int end) {
        while (start < end) {
            if (start % 2 == 0) {
                System.out.print(start + " ");
            }
            start++;
        }
    }

    public static void main(String args[]) {
        int start = 9;
        int end = 100;
        printEvens(start, end);
    }
}