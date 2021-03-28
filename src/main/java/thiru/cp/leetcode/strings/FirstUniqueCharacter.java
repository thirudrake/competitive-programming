package thiru.cp.leetcode.strings;

/*
    First Unique Character in a String
    https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
*/
public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        int[] countArray = new int[256];
        char[] charArray = s.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(countArray[charArray[i]] == 0){
                countArray[charArray[i]] = i+1;
            }
            else {
                countArray[charArray[i]] = -1;
            }
        }
        int index = Integer.MAX_VALUE;
        for(int i : countArray){
            if(i!=-1 && i!=0){
                index = Math.min(index, i);
            }
        }
        if(index==Integer.MAX_VALUE){
            return -1;
        }
        else {
            return index-1;
        }
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}
