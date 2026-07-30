import java.util.ArrayList;

public class PairSumTwoOptimal {
    static boolean pairSum(ArrayList<Integer> nums, int target) {
        int pivot = -1;
        int n = nums.size();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int rp = pivot; // largest
        int lp = pivot + 1; // smallest
        while (lp != rp) {
            if (nums.get(lp) + nums.get(rp) == target) {
                return true;
            } else if (nums.get(lp) + nums.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(15);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        int target = 30;
        System.out.println("Target exists = " + pairSum(nums, target));
    }
}
