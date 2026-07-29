//Print reverse of an arraylist

import java.util.ArrayList;

public class Reverse {
    static void reverse(ArrayList<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.print(nums.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        reverse(nums);
    }
}
