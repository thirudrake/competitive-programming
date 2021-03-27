package thiru.cp.leetcode.array;

/*
    Remove Duplicates from Sorted Array
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
*/

public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int pointer = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[pointer] != nums[i]){
                nums[++pointer] = nums[i];
            }
        }
        return pointer+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
