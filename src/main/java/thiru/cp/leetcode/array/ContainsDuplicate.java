package thiru.cp.leetcode.array;

/*
    Contains Duplicate
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
*/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int num : nums) {
            if (values.contains(num)) {
                return true;
            }
            values.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

        nums = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(nums));

        nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

}
