import java.util.HashSet;
import java.util.Set;
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
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:
Input: n = 2
Output: false
 */
public class LeetCode202_2 {
    static int sumOfPow(int n){
        int ps=0;
        while(n>0){
          int rem = n%10;
          ps +=rem*rem;
          n/=10;
        }
        return ps;
    }
    static public boolean isHappy_2(int n) {
    Set<Integer> powSum = new HashSet<>();
    while(true){
        int sum = sumOfPow(n);
        if(sum==1)return true;
        n=sum;
        if(powSum.contains(n))return false;
        powSum.add(n);    
    }
    }
    public static void main(String[] args) {
        System.out.println(isHappy_2(37));
    }
}
