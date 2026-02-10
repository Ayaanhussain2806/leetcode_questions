// Last updated: 2/10/2026, 3:10:33 PM
class Solution {
    public String generateTag(String caption) {
        String[] words=caption.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            if(s.isEmpty()){
                continue;
            }
            String clean=s.replaceAll("[^A-Za-z]","").toLowerCase();
            if(sb.length()==0){
                sb.append(clean);
            }else{
                sb.append(Character.toUpperCase(clean.charAt(0))).append(clean.substring(1));
            }
        }
        if(sb.length()==0){
            return "#";
        }
        sb.insert(0,'#');
        if(sb.length()>100){
            sb.setLength(100);
        }
        return sb.toString();
    }
}