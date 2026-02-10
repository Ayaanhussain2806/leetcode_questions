// Last updated: 2/10/2026, 3:14:17 PM
class Solution {
    public int brokenCalc(int startValue, int target) {
        int steps=0;
        while(target>startValue){
            if(target%2==0){
                target/=2;
            }else{
                target+=1;
            }
            steps++;
        }
        return steps+(startValue-target);
    }
}