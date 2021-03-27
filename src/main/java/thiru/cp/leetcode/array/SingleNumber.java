package thiru.cp.leetcode.array;

/*
    Single Number
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
*/

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int value = nums[0];
        for(int i=1; i<nums.length; i++){
            value ^= nums[i];
        }
        return value;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));

        nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));

        nums = new int[]{1};
        System.out.println(singleNumber(nums));
    }

}
