package thiru.cp.leetcode.strings;

/*
    Valid Palindrome
    https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/883/
*/
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : charArray){
            if(Character.isLetterOrDigit(c)){
                stringBuilder.append(c);
            }
        }
        charArray = stringBuilder.toString().toLowerCase().toCharArray();
        int i = 0;
        int j = charArray.length-1;
        while (i<j){
            if(charArray[i]!=charArray[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
