// Last updated: 8/7/2025, 11:36:42 AM
class Solution {

    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length - 2; ++i) {
            if (first.equals(words[i]) && second.equals(words[i + 1])) {
                ans.add(words[i + 2]);
            }
        }
        return ans.toArray(new String[0]);
    }
}