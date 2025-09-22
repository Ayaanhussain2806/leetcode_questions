// Last updated: 9/22/2025, 8:39:55 AM
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger c=big1.add(big2);
        return c.toString();
    }
}