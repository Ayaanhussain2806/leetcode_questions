// Last updated: 9/30/2025, 11:57:34 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int n = s.length(), m = p.length();
        if (m > n) return result;

        int[] countP = new int[26]; 
        int[] countS = new int[26]; 

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        for (int i = 0; i < m; i++) {
            countS[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(countP, countS)) {
            result.add(0);
        }

        for (int i = m; i < n; i++) {
            countS[s.charAt(i) - 'a']++;     
            countS[s.charAt(i - m) - 'a']--;  

            if (Arrays.equals(countP, countS)) {
                result.add(i - m + 1);
            }
        }

        return result;
    }
}
