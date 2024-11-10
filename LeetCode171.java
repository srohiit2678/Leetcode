/*Given a string columnTitle that represents the column 
title as appears in an Excel sheet, return its corresponding
column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:
Input: columnTitle = "A"
Output: 1

Example 2:
Input: columnTitle = "AB"
Output: 28

Example 3:
Input: columnTitle = "ZY"
Output: 701
 */
public class LeetCode171 {
    static public int titleToNumber(String columnTitle) {
     int sum = 0,length=columnTitle.length();
         for(int i=length-1;i>=0;i--){
           sum += (columnTitle.charAt(i)-64)*(int)(Math.pow(26,length-i-1));
        }
        return sum;   
    }
    public static void main(String[] args) {
        System.out.println(titleToNumber("ABC"));
    }
}
