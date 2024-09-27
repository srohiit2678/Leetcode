//haystack = "leetcode", needle = "leeto"   //-1
//haystack = "sadbutsad", needle = "sad"    // 0
//haystack = "mississippi",needle = "issip" // 4
public class LeetCode28{
  static int strStr(String haystack, String needle){
   for(int i=0;i<haystack.length()-needle.length()+1;i++){
    if(haystack.charAt(i)==needle.charAt(0)){
     if(haystack.substring(i,needle.length()+i).equals(needle)){
      return i;
       }
     }
   } 
   return -1;   
  }
  public static void main(String[] Args){ 
      System.out.println(strStr( "mississippi","issip"));
  }
    } 
    