/*
 Given an integer columnNumber, return its corresponding column 
 title as it appears in an Excel sheet.

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
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"
 */
public class LeetCode168 {
    static public String convertToTitle(int columnNumber) {
        String title ="";
        while(columnNumber>0){
          char rem = (char)((columnNumber-1)%26+65); //(char)((columnNumber-1)%26+'A');  
          title = rem+title;
          columnNumber = (columnNumber-1)/26;
        }
     return title;
    }
    static public String convertToTitle_1(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while(columnNumber>0){
          char rem = (char)((columnNumber-1)%26+65); //(char)((columnNumber-1)%26+'A');  
          title.append(rem);
          columnNumber = (columnNumber-1)/26;
        }
     return title.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle_1(701));
    }

}
