/*A phrase is a palindrome if, after converting all 
uppercase letters into lowercase letters and removing 
all non-alphanumeric characters, it reads the same 
forward and backward. Alphanumeric characters include 
letters and numbers.

Given a string s, return true if it is a palindrome, 
or false otherwise.

Example 1:
input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class LeetCode125 {
    static public boolean isPalindrome(String s) {
        if(s==" " ||s==""){return true;}
        boolean res = true;
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int low=0,high=s.length()-1;
        while(low<=high){
          if(s.charAt(low)!=s.charAt(high)){
            return false;
          }
          low++;high--;
        }
       return res;
    }
    public static void main(String[] args) {
    System.out.println(isPalindrome("race a e car"));    
}    
}

/*
        String ch="";
        for (int i=0;i<s.length();i++) {
          if(s.charAt(i)>=97 && s.charAt(i)<=122
          || s.charAt(i)>=65 && s.charAt(i)<= 90
          || s.charAt(i)>=48 && s.charAt(i)<= 57){
            ch += s.charAt(i);
          }
        } 
        s = ch.toLowerCase();      
*/