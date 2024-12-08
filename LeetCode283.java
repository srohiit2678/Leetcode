/*
 Given an integer array nums, move all 0's to the end of it while maintaining
 the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */
public class LeetCode283 {
//    static public int[] moveZeroes(int[] nums) {
//         int n = nums.length;
//         int x[]=new int[n];
//         int k=0; 
//            for(int i=0;i<n;i++){
//             if(nums[i]!=0){
//                 x[k++]=nums[i];
//             }
//            }
//            while(k<n){
//             x[k++]=0;
//            } 
//           return x;
//         }    

    //     static public int[] moveZeroes(int[] nums) {
    //         int zero=0,notZ=0;
    //         for(int i=0;i<nums.length;i++){
    //             while(zero<nums.length && nums[zero]!=0){    zero++;    }
    //             while(notZ<nums.length && nums[notZ]==0){    notZ++;    }
    //           if(zero<nums.length && notZ<nums.length){
    //             int temp = nums[zero];
    //             nums[zero] = nums[notZ];
    //             nums[notZ] = temp;
    //           }
    //         }
    //     return nums;
    // }  
    static public int[] moveZeroes(int[] nums) {
        int count =0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                 nums[count++]=nums[i];
            }
        }
        while(count<n){
            nums[count++]=0;
        }
        return nums;
    }

        public static void main(String[] args) {
            int x[]=moveZeroes(new int[]{0,1,0,3,12});
            
            for(int i=0;i<x.length;i++){
                System.out.print(x[i]+" ");
            }
        }
}
