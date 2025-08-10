// Last updated: 8/10/2025, 6:48:41 PM
class Solution {                               
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        Reverse(arr,0,n-1);
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
    }
    public static void Reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}