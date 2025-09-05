import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] wordsArrray = s.split(" ");
        Stack<String> stack = new Stack<>();

        for (String word : wordsArrray) {
            if (" ".equals(word) || "".equals(word)) {
                continue;
            } else {
                stack.push(word);
            }
        }

        StringBuffer sb = new StringBuffer();
        while (stack != null && !stack.isEmpty() && stack.peek() != null) {
            sb.append(stack.pop() + " ");
        }

        return sb.toString().trim();
    }
}
