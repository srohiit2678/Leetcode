/*
Given two strings ransomNote and magazine, return true if ransomNote can be 
constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true 

Example 4:
Input: ransomNote = "bg", magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"
Output: true 

 */

public class LeetCode383 {
   static public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(int i=0;i < magazine.length();i++){
         freq[magazine.charAt(i)-'a']++;
        } 
        for(int i=0;i < ransomNote.length();i++){
            freq[ransomNote.charAt(i)-'a']--;
            if(freq[ransomNote.charAt(i)-'a'] < 0)return false;
        }
        return true;
     }

    static public boolean canConstruct_2(String ransomNote, String magazine) {
        int[] arr= new int[26];
        for(char c: ransomNote.toCharArray()) ++arr[c-'a'];
        for(int c: magazine.toCharArray()) --arr[c-'a'];
        for(int i=0;i<26;++i) {
            if(arr[i]>0) return false;
        }
        return true;
    }
     public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct_2("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
     }
}