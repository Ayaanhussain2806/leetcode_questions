// Last updated: 10/24/2025, 11:24:40 PM
class Solution {
    static String[] nums={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll=new ArrayList<>();
        if(digits.length()==0){
            return ll;
        }
        Combination(digits,"",ll);
        return ll;
    }
    public static void Combination(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        int num=ch-'0';
        String press=nums[num];
        for(int i=0;i<press.length();i++){
            Combination(ques.substring(1),ans+press.charAt(i),ll);
        }
    }
}