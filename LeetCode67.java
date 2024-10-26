/*
Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */
import java.math.BigInteger;
public class LeetCode67 {
    public static String addBinary(String a, String b) {
        // Convert binary Strings to BigInteger
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        
        // Add the two BigIntegers
        BigInteger sum = num1.add(num2);
        
        // Convert the sum back to a binary String
        return sum.toString(2);
    }

    public static void main(String[] args) {
        String a = "11";//"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "1"; // "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a, b));
    }
}

// work on limited length of String

class LeetCode_67 {
    static public String addBinary(String a,String b){
        // Binary String to Integer
        int convertedInteger = Integer.parseInt(a, 2);
        convertedInteger += Integer.parseInt(b, 2);
        // Integer to Binary String
      return Integer.toBinaryString(convertedInteger);
    }
    public static void main1(String[] args) 
    {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary( a, b));
    }
}