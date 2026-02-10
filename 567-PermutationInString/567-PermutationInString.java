// Last updated: 2/10/2026, 3:15:15 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        for(int i=0;i<=m-n;i++){
            String sub=s2.substring(i,i+n);
            char[] cha = sub.toCharArray();
            Arrays.sort(cha);
            String s = new String(cha);
            if(sorted.equals(s)){
                return true;
            }
        }
        return false;
    }
}