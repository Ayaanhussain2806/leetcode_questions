// Last updated: 10/4/2025, 3:28:08 PM
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    List<Integer> ll=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>(); 
    print(ll,ans,n,1,k)  ;
      return ans;
    }
 public static void print(List<Integer> ll,List<List<Integer>> ans,int n,int idx,int k)
    {
        if(n==0 && k==0)
        {
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=idx;i<=9;i++){
           if(n>=i )
            {
            ll.add(i);
            print(ll,ans,n-i,i+1,k-1);
            ll.remove(ll.size()-1);
            }
        }
    }
}