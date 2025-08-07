// Last updated: 8/7/2025, 11:38:29 AM
class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        Partition(s,ll,ans);
        return ans;
    }
    public static void Partition(String s,List<String> ll,List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String part=s.substring(0,i);
            if(ispalindrome(part)){
                ll.add(part);
                Partition(s.substring(i),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String part){
        int i=0;
        int j=part.length()-1;
        while(i<j){
            if(part.charAt(i)!=part.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}