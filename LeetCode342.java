/*
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true

 */
public class LeetCode342 {
   /* time limit excide 
   static public boolean isPowerOfFour(int n) {
     int low = 0;
     int high = n;
     while(low<=high){
        int mid = low +(high-low)/2;
        int sqr = mid*mid*mid*mid; 
        if(sqr==n){
            return true;
        }
        else if(sqr<n){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
     }
     return false;        
    }
     */

     static public boolean isPowerOfFour(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            if(((n >>> i)& 1) !=0){
                if(i%2==1)return false;
                count++;
            }
        }
        return count == 1;        
       }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
