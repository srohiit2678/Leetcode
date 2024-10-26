/*
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 
*/
public class LeetCode66 {
    static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        digits = new int[digits.length+1];
        digits[0]= 1;
        return digits;
    }
// logic 2 Method
    static int[] plusOne1(int[] digits){
        int sum=0,j=1;
        for(int i:digits){
            sum =sum*10+i;
        } 
        if(sum==9 || sum==99 ||sum==999){
            digits = new int[digits.length+1];
        }
        sum++;
        while(sum>0){
           digits[digits.length-j]=sum%10;
           sum/=10;
           j++; 
        }
        return digits;
    }
    public static void main(String[] args) {
    int[] digit = plusOne1(new int[]{9});
        for (int i : digit) {
            System.out.print(i);
        }
}
}