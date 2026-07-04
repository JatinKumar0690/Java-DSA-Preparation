public class Reverse {
    public static void reverse(int nums[]) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 20, 10, 2, 3, 4, 5 };
        reverse(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
