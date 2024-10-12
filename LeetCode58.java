//  "   fly me   to   the moon  " --> 4
//  "Hello world" --> 5
//  "hello Hy" --> 2
public class LeetCode58 {

   static public int lengthOfLastWord(String s){
    int i=0;  
    s=s.trim();
    for(i=s.length()-1;i>=0;i--){
        if(s.charAt(i) !=' '){
            continue;
        }
        break;
    }
    return (s.length()-i-1);
    }
    public static void main(String[] args) {
    String s = "   fly me   to   the moon  ";
    System.out.println(lengthOfLastWord(s));
}   
}
