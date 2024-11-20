
/*
 Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the 
sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:
Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 02 = 1

Example 2:
Input: n = 2
Output: false
 */
public class LeetCode202 {
    static int sumOfPow(int n){
        int ps=0;
        while(n>0){
          int rem = n%10;
          ps +=rem*rem;
          n/=10;
        }
        return ps;
    }
    static public boolean isHappy(int n) {
      int slow = n,fast =n;
    do{
        slow = sumOfPow(slow);
        fast = sumOfPow(sumOfPow(fast));
    }while(slow!=fast);
     return (fast==1);   
    } 
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
   
}
