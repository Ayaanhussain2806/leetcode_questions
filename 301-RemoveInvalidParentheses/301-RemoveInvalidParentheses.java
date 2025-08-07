// Last updated: 8/7/2025, 11:37:43 AM
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Invalid_Parentheses {

    // reference: https://leetcode.com/problems/remove-invalid-parentheses/solution/
    class Solution_dfs {

        private Set<String> validExpressions = new HashSet<String>();
        private int minimumRemoved;

        private void reset() {
            this.validExpressions.clear();
            this.minimumRemoved = Integer.MAX_VALUE;
        }

        private void dfs(
            String s,
            int index,
            int leftCount,
            int rightCount,
            StringBuilder expression,
            int removedCount) {

            // If we have reached the end of string.
            if (index == s.length()) {

                // If the current expression is valid.
                if (leftCount == rightCount) {

                    // If the current count of removed parentheses is <= the current minimum count
                    if (removedCount <= this.minimumRemoved) {

                        // Convert StringBuilder to a String. This is an expensive operation.
                        // So we only perform this when needed.
                        String possibleAnswer = expression.toString();

                        // If the current count beats the overall minimum we have till now
                        if (removedCount < this.minimumRemoved) {
                            this.validExpressions.clear();
                            this.minimumRemoved = removedCount;
                        }
                        this.validExpressions.add(possibleAnswer);
                    }
                }
            } else {

                char currentCharacter = s.charAt(index);
                int length = expression.length();

                // If the current character is neither an opening bracket nor a closing one,
                // simply recurse further by adding it to the expression StringBuilder
                if (currentCharacter != '(' && currentCharacter != ')') {
                    expression.append(currentCharacter);
                    this.dfs(s, index + 1, leftCount, rightCount, expression, removedCount);
                    expression.deleteCharAt(length);
                } else {

                    // Recursion where we delete the current character at 'index' and move forward to 'index+1'
                    this.dfs(s, index + 1, leftCount, rightCount, expression, removedCount + 1);
                    expression.append(currentCharacter);

                    // If it's an opening parenthesis, consider it and recurse
                    if (currentCharacter == '(') {
                        this.dfs(s, index + 1, leftCount + 1, rightCount, expression, removedCount);
                    } else if (rightCount < leftCount) {
                        // For a closing parenthesis, only recurse if right < left
                        this.dfs(s, index + 1, leftCount, rightCount + 1, expression, removedCount);
                    }

                    // Undoing the append operation for other recursions.
                    expression.deleteCharAt(length);
                }
            }
        }

        public List<String> removeInvalidParentheses(String s) {

            this.reset();
            this.dfs(s, 0, 0, 0, new StringBuilder(), 0);
            return new ArrayList(this.validExpressions);
        }
    }


    public class Solution_bfs {
        public List<String> removeInvalidParentheses(String s) {
            List<String> res = new ArrayList<>();

            // sanity check
            if (s == null) return res;

            Set<String> visited = new HashSet<>();
            Queue<String> queue = new LinkedList<>();

            // initialize
            queue.add(s);
            visited.add(s);

            boolean found = false;

            while (!queue.isEmpty()) {
                s = queue.poll();

                if (isValid(s)) {
                    // found an answer, add to the result
                    res.add(s);
                    found = true;
                }

                if (found) continue; // continue to check all in queue, but no more new adding to queue

                // generate all possible states
                for (int i = 0; i < s.length(); i++) {
                    // we only try to remove left or right parent
                    if (s.charAt(i) != '(' && s.charAt(i) != ')') continue;

                    String t = s.substring(0, i) + s.substring(i + 1); // skip char at index=i

                    if (!visited.contains(t)) {
                        // for each state, if it's not visited, add it to the queue
                        queue.add(t);
                        visited.add(t);
                    }
                }
            }

            return res;
        }

        // helper function checks if string s contains valid parantheses
        boolean isValid(String s) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') count++;
                if (c == ')') count--;
                if (count < 0) return false;
            }

            return count == 0;
        }
    }
}


class Solution {
    private String s;
    private int n;
    private Set<String> ans = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        this.s = s;
        this.n = s.length();
        int l = 0, r = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ++l;
            } else if (c == ')') {
                if (l > 0) {
                    --l;
                } else {
                    ++r;
                }
            }
        }
        dfs(0, l, r, 0, 0, "");
        return new ArrayList<>(ans);
    }

    private void dfs(int i, int l, int r, int lcnt, int rcnt, String t) {
        if (i == n) {
            if (l == 0 && r == 0) {
                ans.add(t);
            }
            return;
        }
        if (n - i < l + r || lcnt < rcnt) {
            return;
        }
        char c = s.charAt(i);
        if (c == '(' && l > 0) {
            dfs(i + 1, l - 1, r, lcnt, rcnt, t);
        }
        if (c == ')' && r > 0) {
            dfs(i + 1, l, r - 1, lcnt, rcnt, t);
        }
        int x = c == '(' ? 1 : 0;
        int y = c == ')' ? 1 : 0;
        dfs(i + 1, l, r, lcnt + x, rcnt + y, t + c);
    }
}