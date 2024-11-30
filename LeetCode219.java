/*
 Given an integer array nums and an integer k, return true if there are 
 two distinct indices i and j in the array such that nums[i] == nums[j] 
 and abs(i - j) <= k.

 Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */
import java.util.Map;
import java.util.HashMap;
 public class LeetCode219{
    static public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> contain = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!contain.containsKey(nums[i])){   
                contain.put(nums[i],i);
            }
            else{
                int duplicateIndex = contain.get(nums[i]);

                if(Math.abs(duplicateIndex - i) <= k){
                    return true;
                }
                else{
                    contain.put(nums[i],i);
                }
            }
        }
    return false;
    }
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3 ));
    }
 } 