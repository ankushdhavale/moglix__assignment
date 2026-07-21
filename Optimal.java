import java.util.Stack;

//optimal tc = O(n)  sc = O(n).
public class Optimal {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";

        System.out.println("Output: " + longestValidParentheses(s1));
        System.out.println("Output: " + longestValidParentheses(s2));
        System.out.println("Output: " + longestValidParentheses(s3));
    }
}
