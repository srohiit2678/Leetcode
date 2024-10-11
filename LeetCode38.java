/*
 he count-and-say sequence is a sequence of digit strings defined 
 by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the run-length encoding of countAndSay(n - 1).
Run-length encoding (RLE) is a string compression method that works 
by replacing consecutive identical characters (repeated 2 or more 
times) with the concatenation of the character and the number marking
the count of the characters (length of the run). For example, to 
compress the string "3322251" we replace "33" with "23", 
replace "222" with "32", replace "5" with "15" and 
replace "1" with "11". Thus the compressed string becomes "23321511".

Given a positive integer n, return the nth element of the 
count-and-say sequence.

 

Example 1:
Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"

Example 2:
Input: n = 1
Output: "1"
Explanation:
This is the base case.


n = 1: return 1 is the base case
n = 2: return count of last entry i.e. 1 1
n = 3: return count of last entry i.e. two 1's so 21
n = 4: we have one 2 and one 1 so 1211
n = 5: we have one 1 and one 2 and two 1's so -> 111221
n = 6: we have three 1's, two 2's and one 1 so -> 312211
n = 7: we have one 3, one 1, two 2's and two 1's -> 13112221
 */

public class LeetCode38 {
    static public String result(String s){
        char ch = s.charAt(0);
        int count = 1;
        String res ="";
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
            else{
                res+=count+""+ch;
                ch = s.charAt(i);
                count=1;
            }              
        }
        res+=count+""+ch;
     return res;
    } 
    static public String countAndSay(int n) {
        String s = "1"; 
        for(int i=1;i<n;i++){
            s = result(s); 
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
