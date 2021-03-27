package thiru.cp.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Intersection of Two Arrays II
    https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
*/
public class IntersectionOfArrays2 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> outputList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                outputList.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        int[] output = new int[outputList.size()];
        i = 0;
        for(Integer value : outputList){
            output[i++] = value;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[] {4,9,5};
        nums2 = new int[] {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[] {1,2,2,1};
        nums2 = new int[] {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[] {3,1,2};
        nums2 = new int[] {1,1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

        nums1 = new int[] {1,2,2,1};
        nums2 = new int[] {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
