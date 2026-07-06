//Question: Find the maximum subarray sum
//Better approach than Brute

public class BetterSubarray {
    public static int subArray(int nums[]) {
        int currentSum = 0;
        int largest = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currentSum > largest) {
                    largest = currentSum;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int nums[] = { 1, -2, 6, -1, 3 };
        System.out.println("The largest sum of subarray will be " + subArray(nums));
    }
}
