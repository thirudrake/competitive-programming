package thiru.cp.leetcode.strings;

/*
    String to Integer (atoi)
    https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/884/
*/
public class StringToInteger {

    public static int myAtoi(String s) {
        if (s == null || s.length() < 1)
            return 0;

        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }

        char flag = '+';

        int i = 0;
        if (s.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        double result = 0;

        while (s.length() > i && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }

        if (flag == '-')
            result = -result;

        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("-+12"));
        System.out.println(myAtoi("21474836460"));
    }

}
