package thiru.cp.leetcode.array;

import java.util.Arrays;

/*
    Two Sum
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
*/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

        nums = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));

        nums = new int[]{3,3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
}
