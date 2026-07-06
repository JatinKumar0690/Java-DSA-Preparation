//Question: Find the maximum subarray sum
//Optimal approach by using Lighting fast Kadane's algorithm

public class OptimalSubarray {
    public static int kadane(int nums[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            ms = Math.max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, -4, -2, -2, -2, -5, -3 };
        System.out.println("Maximum sum of subarray will be " + kadane(nums));
    }
}
