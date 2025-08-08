

import java.util.HashSet;
public class LeetCode349 {
    static public int[] intersection(int[] nums1, int[] nums2) {
        int r=0;
        int[] temp =new int[nums1.length];
        HashSet<Integer> set = new HashSet<>();
        
        for(Integer i:nums1){
           set.add(i);

        }

        for(Integer i:nums2){
            if(set.contains(i)){
                temp[r++]=i;  
                set.remove(i);
            }
        }

        int[] res = new int[r];
        for(int i = 0;i<r;i++){
            res[i] = temp[i];
        }           
        return res;
       }
    public static void main(String[] args) {
        for(int i :intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})){
            System.out.println(i);
        }
    }
}
