public class LinearSearch {
    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;
        System.out.println(linearSearch(nums, key)); // Output => 4
    }
}
