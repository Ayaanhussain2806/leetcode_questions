// Last updated: 2/10/2026, 3:13:37 PM
class Solution {
    public int maximum69Number (int num) {
        String str=String.valueOf(num);
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        str = new String(arr);
        return Integer.parseInt(str);
    }
}