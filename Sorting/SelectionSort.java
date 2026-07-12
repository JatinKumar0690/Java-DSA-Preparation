//Sort in increasing order using selection sort algorithm

public class SelectionSort {
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n - 2; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            // swapping
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void printArr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 5, 4, 1, 3, 2 };
        selectionSort(nums);
        printArr(nums);
    }
}
