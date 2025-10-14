// Last updated: 10/14/2025, 10:40:23 PM
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Object[][] people=new Object[names.length][2];
        for(int i=0;i<names.length;i++){
            people[i][0]=names[i];
            people[i][1]=heights[i];
        }
        Arrays.sort(people,(a,b)->(int)b[1]-(int)a[1]);
        String[] result=new String[names.length];
        for(int i=0;i<names.length;i++){
            result[i]=(String)people[i][0];
        }
        return result;
    }
}