//Swap 2 numbers

import java.util.ArrayList;

public class Swap {
    static void swapNums(ArrayList<Integer> nums, int idx1, int idx2) {
        int temp = nums.get(idx1);
        nums.set(idx1, idx2);
        nums.set(idx2, temp);
        System.out.println(nums);
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(6);
        swapNums(nums, 1, 3);
    }
}
