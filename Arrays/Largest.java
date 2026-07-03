import java.util.*;

public class Largest {
    public static int largestNumber(int numbers[], int largest) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 5, 6, 8, 10, 13, 30, 19, 18, 23 };
        int largest = Integer.MIN_VALUE;
        System.out.println("The largest number in the given array is " + largestNumber(numbers, largest));
    }
}
