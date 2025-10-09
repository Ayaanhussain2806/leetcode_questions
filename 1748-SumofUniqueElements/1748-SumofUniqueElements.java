// Last updated: 10/10/2025, 3:38:36 AM
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0) + 1);
        }
        int sum=0;
        for(int i:freq.keySet()){
            if(freq.get(i)==1){
                sum+=i;
            }
        }
        return sum;
    }
}