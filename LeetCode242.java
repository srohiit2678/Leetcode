
/*
Given two strings s and t, return true if t is an anagram
of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */

public class LeetCode242 {
    static public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int i=0;
        if(n1!=n2)return false;
        int ch[] = new int[26];
        while(i<s.length()){
            ch[s.charAt(i)-97]++;
            ch[t.charAt(i)-97]--;
            i++;
        }
        for(i=0;i<26;i++){
            if(ch[i]!=0)return false;
        }
    return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rama", "aarm"));
    }
}
