// Last updated: 2/10/2026, 3:15:03 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else if(operations[i].equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
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