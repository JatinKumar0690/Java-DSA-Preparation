public class PrintTriplets {
    public static void triplets(int nums[]) {
        int n = nums.length;
        for (int i = 0; i <= n - 3; i++) {
            // j starts after i, goes up to the 2nd to last element
            for (int j = i + 1; j <= n - 2; j++) {
                // k starts after j, goes to the very last element
                for (int k = j + 1; k <= n - 1; k++) {
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        triplets(nums);
    }
}
