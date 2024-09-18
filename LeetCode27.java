class LeetCode27{
static int removeElement(int[] nums, int val) {
       System.out.println(); 
		int index=0;
	
		for(int i:nums){
			if(i==val){ continue;	}
			nums[index]=i;	index++;
		}
	
		return index;
	
	}
public static void main(String[] Args){

	int nums[] = {0,1,2,2,3,0,4,2}, val = 2;
	val = removeElement(nums,val);
	for(int i=0;i<val;i++){
     System.out.println(nums[i]); 
	}

}
} 