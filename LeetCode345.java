/*
 Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower 
and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede"
*/
public class LeetCode345{
    static public String reverseVowels(String s) {
       char[] arr = s.toCharArray();
      int i=0,j=arr.length-1;
    while(i<j){
        if(!isVowel(arr[i])){
            i++;
        }        
        else if(!isVowel(arr[j])){
            j--;
        }
        else{
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    return String.valueOf(arr);
}
    public static boolean isVowel(char ch){
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
    return false;
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
    }
}