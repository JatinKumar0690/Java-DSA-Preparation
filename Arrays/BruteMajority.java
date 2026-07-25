//Brute force

public class BruteMajority {
    static int majority(int[] nums) {
        int frequency = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    frequency++;
                }
            }
            if (frequency > nums.length/2) {
                return nums[i];
            }
        }
        return nums[0];
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,4,4};
        System.out.println(majority(nums));;
    }
}
