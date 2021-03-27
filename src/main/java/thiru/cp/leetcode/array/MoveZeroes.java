package thiru.cp.leetcode.array;

import java.util.Arrays;

/*
    Move Zeroes
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
*/
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[j]!=0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0};
        moveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
