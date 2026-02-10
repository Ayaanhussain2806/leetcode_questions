// Last updated: 2/10/2026, 3:13:54 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            int min=Integer.MAX_VALUE;
            for(int i=1;i<arr.length;i++){
                min=Math.min(Math.abs(arr[i]-arr[i-1]),min);
            }
            List<List<Integer>> res=new ArrayList<>();
            for(int i=1;i<arr.length;i++){
                if(Math.abs(arr[i]-arr[i-1])==min){
                    res.add(Arrays.asList(arr[i-1],arr[i]));
                }
            }
            return res;
    }
}