// Last updated: 2/10/2026, 3:13:38 PM
class Solution {
    private static final int[] POW10 = {1, 10, 100, 1000, 10000, 100000, 1000000};
    
    public boolean isSolvable(String[] words, String result) {
        Set<Character> leadingSet = new HashSet<>();
        for (String w : words) {
            if (w.length() > 1) leadingSet.add(w.charAt(0));
        }
        if (result.length() > 1) leadingSet.add(result.charAt(0));
        
        Set<Character> charSet = new HashSet<>();
        for (String w : words) {
            for (char c : w.toCharArray()) charSet.add(c);
        }
        for (char c : result.toCharArray()) charSet.add(c);
        
        if (charSet.size() > 10) return false;
        
        int maxWordLength = 0;
        for (String w : words) {
            maxWordLength = Math.max(maxWordLength, w.length());
        }
        if (result.length() > maxWordLength + 1) return false;
        
        List<Character> charList = new ArrayList<>(charSet);
        int[] charToDigit = new int[26];
        Arrays.fill(charToDigit, -1);
        boolean[] usedDigit = new boolean[10];
        
        return backtrack(0, 0, charList, charToDigit, usedDigit, words, result, leadingSet);
    }
    
    private boolean backtrack(int pos, int sum, List<Character> charList, int[] charToDigit,
                             boolean[] usedDigit, String[] words, String result,
                             Set<Character> leadingSet) {
        if (pos == charList.size()) {
            return sum == 0 && validateEquation(charToDigit, words, result);
        }
        
        char c = charList.get(pos);
        
        for (int digit = 0; digit <= 9; digit++) {
            if (usedDigit[digit]) continue;
            
            if (digit == 0 && leadingSet.contains(c)) continue;
            
            charToDigit[c - 'A'] = digit;
            usedDigit[digit] = true;
            
            if (backtrack(pos + 1, sum, charList, charToDigit, usedDigit, 
                         words, result, leadingSet)) {
                return true;
            }
            
            charToDigit[c - 'A'] = -1;
            usedDigit[digit] = false;
        }
        
        return false;
    }
    
    private boolean validateEquation(int[] charToDigit, String[] words, String result) {
        long totalSum = 0;
        for (String word : words) {
            long wordValue = 0;
            for (char c : word.toCharArray()) {
                int digit = charToDigit[c - 'A'];
                if (digit == -1) return false;
                wordValue = wordValue * 10 + digit;
            }
            totalSum += wordValue;
        }
        
        
        long resultValue = 0;
        for (char c : result.toCharArray()) {
            int digit = charToDigit[c - 'A'];
            if (digit == -1) return false; 
            resultValue = resultValue * 10 + digit;
        }
        
        return totalSum == resultValue;
    }
}