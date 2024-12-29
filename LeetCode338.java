/*
 Given an integer n, return an array ans of length n + 1 such that 
 for each i (0 <= i <= n), ans[i] is the number of 1's in the binary 
 representation of i.

 Example 1:
Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10

Example 2:
Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
 */

 public class LeetCode338 {
    static public int oneBit(int n){
        int count = 0;
        while(n!=0){
            if(n%2==1){ count++; }
            n/=2;
        }
        return count;
    }

    static public int[] countBits(int n) {
        int ans[] = new int[n+1];   
        for(int i=0;i<=n;i++){
        ans[i] = oneBit(i);
           }
    return ans;
   }
   static public int[] countBits2(int n) {
    int ans[] = new int[n+1];
    ans[0]=0;   
    for(int i=1;i<=n;i++){
    ans[i] = ans[i/2]+i%2;
       }
return ans;
}
    public static void main(String[] args) {
       // int ans[] = countBits(2); // basic O(nlogn)
       int ans[] = countBits2(2); // advance O(n)
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
