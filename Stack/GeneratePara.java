package Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratePara {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.AllParenthesis(3);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

class Solution {

    public List<String> AllParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        backtrack(result, stack, 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, Stack<Character> stack, int open, int close, int max) {
        if (stack.size() == 2 * max) {
            StringBuilder sb = new StringBuilder();
            for (Character c : stack) {
                sb.append(c);
            }
            result.add(sb.toString());
            return;
        }

        if (open < max) {
            stack.push('(');
            backtrack(result, stack, open + 1, close, max);
            stack.pop();
        }
        if (close < open) {
            stack.push(')');
            backtrack(result, stack, open, close + 1, max);
            stack.pop();
        }
    }
}
