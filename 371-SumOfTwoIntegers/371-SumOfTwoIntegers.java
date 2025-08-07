// Last updated: 8/7/2025, 11:37:29 AM
public class Sum_of_Two_Integers {

    public static void main(String[] args) {

        Sum_of_Two_Integers out = new Sum_of_Two_Integers();

        System.out.println(out.getSum(2, 2)); // with carry
    }


    public int getSum(int a, int b) {
        if(b == 0){ // complete the operation when there is no carry
            return a;
        }

        int sum, carry;
        sum = a^b; // step-1 sum
        carry = (a&b)<<1; // step-2 sum

        return getSum(sum, carry);
    }
}


class Solution {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}