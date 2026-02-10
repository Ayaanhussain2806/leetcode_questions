// Last updated: 2/10/2026, 3:15:20 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(freq.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}