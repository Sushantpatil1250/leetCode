import java.util.*;

class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> result = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {

            String curr = queue.poll();

            if (isValid(curr)) {
                result.add(curr);
                found = true;
            }

            // Once valid strings are found,
            // don't generate deeper levels
            if (found) {
                continue;
            }

            for (int i = 0; i < curr.length(); i++) {

                char ch = curr.charAt(i);

                // Ignore letters
                if (ch != '(' && ch != ')') {
                    continue;
                }

                // Remove one parenthesis
                String next =
                        curr.substring(0, i)
                        + curr.substring(i + 1);

                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.offer(next);
                }
            }
        }

        return result;
    }


    public boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;
            }

            else if (ch == ')') {
                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}