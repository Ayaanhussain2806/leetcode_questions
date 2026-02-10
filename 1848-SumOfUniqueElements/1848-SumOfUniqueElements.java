// Last updated: 2/10/2026, 3:12:55 PM
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