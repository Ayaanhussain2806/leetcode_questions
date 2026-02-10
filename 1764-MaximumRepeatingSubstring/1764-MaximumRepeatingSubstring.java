// Last updated: 2/10/2026, 3:13:08 PM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int c=0;
        String tar=word;
        while(sequence.contains(tar)){
            c++;
            tar=tar+word;
        }
        return c;
    }
}