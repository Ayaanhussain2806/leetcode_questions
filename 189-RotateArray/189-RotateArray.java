// Last updated: 8/7/2025, 11:38:17 AM
class Solution {                               
    public void rotate(int[] nums, int k) {
           Rotate(nums,k);
    }
    public static void Rotate(int[] arr,int k)
    {
        int n=arr.length;
        k=k%n;
        // starting n-k reverse
        Reverse(arr,0,n-k-1);
        // last ke k reverse
        Reverse(arr,n-k,n-1);
        // all elements reverse kro
        Reverse(arr,0,n-1);
    }
    public static void Reverse(int[] arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}