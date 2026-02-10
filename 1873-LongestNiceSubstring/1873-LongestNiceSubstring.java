// Last updated: 2/10/2026, 3:12:54 PM
class Solution {
    public String longestNiceSubstring(String s) {
        int n=s.length();
        String result="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub=s.substring(i,j);
                if(isNice(sub) && sub.length()>result.length()){
                    result=sub;
                }
            }
        }
        return result;
    }
    public static boolean isNice(String s){
        Set<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        for(char ch:set){
            if(!set.contains(Character.toLowerCase(ch))||
            !set.contains(Character.toUpperCase(ch))){
                return false;
            }
        }
        return true;
    }
}