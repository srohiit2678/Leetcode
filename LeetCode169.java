/*Given an array nums of size n, return the majority 
element.

The majority element is the element that appears more 
than ⌊n / 2⌋ times. You may assume that the majority element
always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2 */
public class LeetCode169 {
    static public int majorityElement(int[] nums) {
        int element = 0;
        int frequncy = 0;
        for(int i=0;i<nums.length;i++){
           if(frequncy==0){    element = nums[i]; }
           if(element == nums[i]){ frequncy++; }
           else {  frequncy--; }
       }
       return element; 
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
 