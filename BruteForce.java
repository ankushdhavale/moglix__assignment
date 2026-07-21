//Brute Force tc = O(n³) sc = O(1)
public class BruteForce{
       public static int longestValidParentheses(String s) {
           int maxLength = 0;
           for (int i = 0; i < s.length(); i++) {
               for (int j = i + 2; j <= s.length(); j += 2) {
                   if (isValid(s, i, j - 1)) {
                       maxLength = Math.max(maxLength, j - i);
                   }
               }
           }
           return maxLength;
       }

       private static boolean isValid(String s, int left, int right) {
           int balance = 0;

           for (int i = left; i <= right; i++) {
               char ch = s.charAt(i);

               if (ch == '(') {
                   balance++;
               } else {
                   if (balance == 0) {
                       return false;
                   }
                   balance--;
               }
           }

           return balance == 0;
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


