public class LinearSearch {
    public static int linearSearch(int number[], int target) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 8, 2, 5, 6, 7 };
        int target = 7;
        System.out.println("The key is found at index " + linearSearch(number, target));
    }
}
