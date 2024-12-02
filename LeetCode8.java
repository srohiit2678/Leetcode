
/*
 Implement the myAtoi(string s) function, which converts a string to a 32-bit 
 signed integer.
 The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', 
assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character 
is encountered or the end of the string is reached. If no digits were read, then 
the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], 
then round the integer to remain in the range. Specifically, integers less than -231
should be rounded to -231, and integers greater than 231 - 1 should be rounded to 
231 - 1.
Return the integer as the final result.

 

Example 1:

Input: s = "42"

Output: 42

Explanation:

The underlined characters are what is read in and the caret is the current reader 
position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
Example 2:

Input: s = " -042"

Output: -42

Explanation:

Step 1: "   -042" (leading whitespace is read and ignored)
            ^
Step 2: "   -042" ('-' is read, so the result should be negative)
             ^
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
               ^
Example 3:

Input: s = "1337c0d3"

Output: 1337

Explanation:

Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
         ^
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character 
is a non-digit)
             ^
Example 4:

Input: s = "0-1"

Output: 0

Explanation:

Step 1: "0-1" (no characters read because there is no leading whitespace)
         ^
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "0-1" ("0" is read in; reading stops because the next character is a 
non-digit)
          ^
Example 5:

Input: s = "words and 987"

Output: 0

Explanation:

Reading stops at the first non-digit character 'w'.


More case : ==> 
input: s =  "4193 with words"
output: s = 4193

input: s = "-91283472332" 
output: s = -2147483648

input: s = "" 
output: s = 0


input: s = "+1" 
output: s = 1
    
input: s = "21474836460" 
output: s = 2147483647  

input: s = "2147483646" 
output: s = 2147483646  


 */



public class LeetCode8 {
    public static int myAtoi(String s) {
        
        int i=0;
        long res=0;
        boolean neg = false;
       // while(s.charAt(i)==' ')i++;
        s = s.trim();
        int len = s.length();
        if(len==0)return 0; 
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            if(s.charAt(i)=='-')neg = true;
            i++;
        }
        // while( i<len && (s.charAt(i)>=48 && s.charAt(i)<=57)){ 
        //     int val = s.charAt(i)-48;
        //     System.out.println(res==Integer.MAX_VALUE/10 && (s.charAt(i)>Integer.MAX_VALUE%10));
        // if(res > Integer.MAX_VALUE/10 ||( res == Integer.MAX_VALUE/10 && s.charAt(i)>Integer.MAX_VALUE%10 )){
        //     if(neg ||res*10==Integer.MAX_VALUE){
        //         return Integer.MIN_VALUE;
        //     }
        //     return Integer.MAX_VALUE;
        // }
        // res = res*10 + val; 
        // i++;
        // }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + digit;
            i++;
        }
        if(neg)res=-res;

    return (int)res;
    }


public static void main(String[] args) {
  System.out.println(myAtoi("-91283472332")); 
//   System.out.println(myAtoi("2147483647"));

}

}

