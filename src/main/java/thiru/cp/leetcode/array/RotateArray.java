package thiru.cp.leetcode.array;

/*
    Rotate Array
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
*/

import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        for(int i=0; i<k; i++){
            int previousValue = nums[0];
            for(int j=1; j<nums.length; j++){
                int temp = nums[j];
                nums[j] = previousValue;
                previousValue = temp;
            }
            nums[0] = previousValue;
        }
    }

    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        r.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{-1, -100, 3, 99};
        r.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{1, 2};
        r.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
