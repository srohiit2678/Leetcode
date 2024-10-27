/*
 You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
========================================================
        // but it gives time limit exceeds
        --> we use a formula : f(n)=f(n-1)+f(n-2)
        --> return (climbStairs(n-1)+climbStairs(n-2));
========================================================
        // so use fibonacci solution

*/
public class LeetCode70 {
    /*static public int climbStairs(int n){
        if(n<=1){
            return 1;
        }
        else
        return (climbStairs(n-1)+climbStairs(n-2));
    }*/

    static public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        else{
           int a=3,b=2;
            for(int i=0;i<n-3;i++){
                a=a+b;
                b=a-b;
            }
          return a;
        }
    }     
    public static void main(String[] args) {
    System.out.println(climbStairs(45));
   } 
}
