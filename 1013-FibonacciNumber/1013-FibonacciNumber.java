// Last updated: 8/7/2025, 11:36:49 AM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int i=1;
        if(n==0){
            return 0;
        }
        while(i<n){
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        return b;
    }
}