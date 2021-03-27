package thiru.cp.leetcode.array;

/*
    Plus One
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
*/

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int carryOver = 1;
        for(int i = digits.length-1; i>=0; i--){
            int sum = digits[i] + carryOver;
            digits[i] = sum%10;
            carryOver = sum/10;
        }
        if(carryOver > 0){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = carryOver;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[]{4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[]{0};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[]{9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
