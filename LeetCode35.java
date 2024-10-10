/*
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
 
 */
public class LeetCode35 {
    static int searchInsert(int[] nums, int target){
      int i=0;
        if(nums[nums.length-1]<target){
        return nums.length;
       }
       else{
        while(nums[i]<target){
            i++;
        }
       }
        return i;
    }        
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }
}
