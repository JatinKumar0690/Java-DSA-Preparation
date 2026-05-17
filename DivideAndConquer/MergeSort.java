public class MergeSort {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void merge(int nums[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si; // Left Part Iterator
        int j = mid + 1; // Right part iterator
        int k = 0; // Iterator for the temp array
        while (i <= mid && j <= ei) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                k++;
                i++;
            } else {
                temp[k] = nums[j];
                k++;
                j++;
            }
        }
        // Left remaining elements
        while (i <= mid) {
            temp[k] = nums[i];
            k++;
            i++;
        }
        // Right remaining elements
        while (j <= ei) {
            temp[k] = nums[j];
            k++;
            j++;
        }
        // Copying to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void mergeSort(int nums[], int si, int ei) {
        // BaseCase
        if (si >= ei) {
            return;
        }
        // Middle
        int mid = si + (ei - si) / 2; // si + ei / 2;
        // work
        mergeSort(nums, si, mid); // Left
        mergeSort(nums, mid + 1, ei); // Right
        merge(nums, si, ei, mid); // Merge
    }

    public static void main(String args[]) {
        int nums[] = { 4, -1, 8, 1, 2 };
        mergeSort(nums, 0, nums.length - 1);
        printArray(nums); // Output [-1,1,2,4,8]
    }
}
