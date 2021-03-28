package thiru.cp.leetcode.strings;

import java.util.Arrays;

/*
    Reverse Integer
    https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/880/
*/
public class ReverseInteger {

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while (i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        boolean isNegative = false;
        if(s.startsWith("-")){
            isNegative = true;
            s = s.substring(1);
        }
        char[] sArray =  s.toCharArray();
        reverseString(sArray);
        String reversedString = String.valueOf(sArray);
        String POSITIVE_LIMIT = "2147483647";
        String NEGATIVE_LIMIT = "2147483648";
        if(isNegative){
            if(reversedString.length() == NEGATIVE_LIMIT.length()){
                if(reversedString.compareTo(NEGATIVE_LIMIT) <= 0){
                    return Integer.parseInt(reversedString) * -1;
                }
                else {
                    return 0;
                }
            }
            else {
                return Integer.parseInt(reversedString) * -1;
            }
        }
        else {
            if(reversedString.length() == POSITIVE_LIMIT.length()){
                if(reversedString.compareTo(POSITIVE_LIMIT) <=0){
                    return Integer.parseInt(reversedString);
                }
                else {
                    return 0;
                }
            }
            else {
                return Integer.parseInt(reversedString);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
    }
}
