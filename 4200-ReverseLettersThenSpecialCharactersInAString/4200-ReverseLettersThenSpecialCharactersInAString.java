// Last updated: 2/10/2026, 3:10:18 PM
class Solution {
    public String reverseByType(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(!Character.isLetter(arr[l])){
                l++;
            }else if(!Character.isLetter(arr[r])){
                r--;
            }else{
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        int m=0;
        int n=arr.length-1;
        while(m<n){
            if(Character.isLetter(arr[m])){
                m++;
            }else if(Character.isLetter(arr[n])){
                n--;
            }else{
                char temp=arr[m];
                arr[m]=arr[n];
                arr[n]=temp;
                m++;
                n--;
            }
        }
        return new String(arr);
    }
}