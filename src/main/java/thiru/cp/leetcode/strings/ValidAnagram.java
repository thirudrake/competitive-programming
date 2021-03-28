package thiru.cp.leetcode.strings;

/*
    Valid Anagram
    https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/882/
*/
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sArray = s.toLowerCase().toCharArray();
        char[] tArray = t.toLowerCase().toCharArray();
        int[] countArray = new int[256];
        for(char c: sArray){
            countArray[c] += 1;
        }
        for(char c: tArray){
            if(countArray[c] == 0){
                return false;
            }
            else {
                countArray[c] -= 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("ab", "a"));
    }
}
