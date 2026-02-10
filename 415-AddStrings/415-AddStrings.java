// Last updated: 2/10/2026, 3:15:44 PM
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger c=big1.add(big2);
        return c.toString();
    }
}