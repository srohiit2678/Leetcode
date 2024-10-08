/*
 Given a string s containing just the characters '(', ')', '{', '}', '[' 
 and ']', determine if the input string is valid. An input string is valid 

 if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true
 */
import java.util.Stack;

public class LeetCode20 {
    static public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
        if(s.length()%2==1){     return false;    }

       for(char c:s.toCharArray()){
            if( c =='(' || c =='{' || c =='['){  stack.push(c);    }

            else {
                if(stack.isEmpty()){ return false; }
            
            char ch = stack.pop();
            if((c==')' && ch != '(' )||( c=='}' && ch != '{') ||
            (c==']' && ch != '[')) { return false;}   
            }
            }
        return stack.isEmpty();
            }
    public static void main(String[] args) {
        System.out.println(isValid("[[][][]]{{{}}}((()))"));
    }
}
