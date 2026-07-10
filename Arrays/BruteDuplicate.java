// given an integer array number return true if any value
//  appears at least twice in the array and return false if every element is distinct

//Brute force 

public class BruteDuplicate {
    public static boolean containsDuplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }

}


//Time complexity = O(n^2)
//Space complexity = O(1)