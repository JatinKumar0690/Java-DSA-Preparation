// Given an emtpy array of size n as you move upward in the call stack fill it with 1,2,3,4,5 as you
//go down to downward decrease the every element by 2

import java.util.Scanner;

public class BackTrackArray {
    public static void changeArr(int nums[], int i, int val) {
        // Base case
        if (i == nums.length) {
            printArr(nums);
            return;
        }

        // Recursion
        nums[i] = val;
        changeArr(nums, i + 1, val + 1);
        nums[i] = nums[i] - 2;
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        changeArr(nums, 0, 1);
        printArr(nums);
    }
}
