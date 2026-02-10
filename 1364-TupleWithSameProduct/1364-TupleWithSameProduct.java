// Last updated: 2/10/2026, 3:13:43 PM
class Solution {
    public int tupleSameProduct(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> productt=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product=nums[i]*nums[j];
                res+=8*productt.getOrDefault(product,0);
                productt.put(product,productt.getOrDefault(product,0)+1);
            }
        }
        return res;
    }
}