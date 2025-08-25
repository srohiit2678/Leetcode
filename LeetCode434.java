/*
 Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.

Example 1:
Input: s = 
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

Example 2:
Input: s = "Hello"
Output: 1   
 
 */


public class LeetCode434 {
    static public int countSegments(String s) {
            if(s.length()==0)return 0;
            int count=0;
            for(int i=0;i<s.length();i++){
               if((i==0 || s.charAt(i-1) ==' ') && s.charAt(i)!=' ')count++;
            }
            return count; 
    }    
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }
}
