// Last updated: 10/18/2025, 4:33:41 PM
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