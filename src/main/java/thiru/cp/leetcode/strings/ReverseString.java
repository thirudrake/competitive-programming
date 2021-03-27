package thiru.cp.leetcode.strings;

import java.util.Arrays;

/*
    Reverse String
    https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
*/
public class ReverseString {

    public void reverseString(char[] s) {
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

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        char[] s = {'h','e','l','l','o'};
        r.reverseString(s);
        System.out.println(Arrays.toString(s));

        s = new char[] {'H','a','n','n','a','h'};
        r.reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
