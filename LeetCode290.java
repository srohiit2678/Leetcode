/*
 Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between
a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same 
letter.
 

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation:
The bijection can be established as:
'a' maps to "dog".
'b' maps to "cat".

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 */
import java.util.HashMap;
//import java.util.StringTokenizer;

public class LeetCode290 {
    // static public boolean wordPattern(String pattern, String s) {
    //     HashMap<Character,String> contain = new HashMap<Character,String>();
    //     int i=0;
    //     StringTokenizer st = new StringTokenizer(s);
    //     while(st.hasMoreTokens()){
    //         if(!contain.containsKey(pattern.charAt(i))){   
    //         contain.put(pattern.charAt(i),st.nextToken());
    //     }
    //     else if(contain.containsKey(pattern.charAt(i))){
    //         if(!contain.containsValue(st.nextToken()))return false;
    //     }
    //     i++;
        
    // }
    //     return true;
    //   }

    static public boolean wordPattern(String pattern, String s) {
       String arr[] = s.split(" ");
        HashMap<Character,String> contain = new HashMap<Character,String>();
        if(!(pattern.length()==arr.length))return false;
            for(int i=0;i<arr.length;i++){
              char ch = pattern.charAt(i);
              boolean key = contain.containsKey(ch);
              if(contain.containsValue(arr[i]) && !key)
              return false;
              
              if(key && !(contain.get(ch).equals(arr[i])))return false;
            
              else{     contain.put(ch, arr[i]);    }
            }

        return true;
      }
   public static void main(String[] args) {
    System.out.println(wordPattern("abba", "dog dog dog dog"));
   }
}
