// Last updated: 11/15/2025, 10:34:27 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                int d=st.peek();
                st.push(d*2);
            }else if(operations[i].equals("+")){
                int h=st.pop();
                int f=st.peek();
                st.push(h);
                st.push(h+f);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int x:st){
            sum+=x;
        }
        return sum;
    }
}