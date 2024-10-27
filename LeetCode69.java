// 25 --> 5
//  8 --> 2.82 --> 2
// 16 --> 4
// 2147395599  --> 46339

public class LeetCode69 {
  static public int sqrt(int n){
    int low=1,high=(n/2)+1;    
    while(low<=high){
      long mid =(low+high)/2;
      if(mid*mid<=n){
        low =(int)mid+1;
      }
      else{
        high=(int)mid-1;
      }
    }
 return high;
} 
 public static void main(String[] args) {
    System.out.println(sqrt(2147395599));
    }     
}