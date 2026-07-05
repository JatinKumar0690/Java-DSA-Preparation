//Question: Find the maximum subarray sum
//Brute force approach 

public class BruteSubarray {
    public static int subarraySum(int arr[]) {
        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                if (currentSum > maximumSum) {
                    maximumSum = currentSum;
                }
            }
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        System.out.println("The maximum sum of subarray will be " + subarraySum(arr));
    }
}
