// Last updated: 9/25/2025, 8:21:06 PM
class Solution {
    public int dayOfYear(String date) {
        String[] parts=date.split("-");
        int year=Integer.parseInt(parts[0]);
        int month=Integer.parseInt(parts[1]);
        int dat=Integer.parseInt(parts[2]);
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isleapyear(year)){
            days[1]=29;
        }
        int total=0;
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        total+=dat;
        return total;
    }
    
    public static boolean isleapyear(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}