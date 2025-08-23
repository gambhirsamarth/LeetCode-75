import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> vowelsSet = new Stack<>();
        List<Integer> vowelIndexes = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
                    || charArray[i] == 'u' ||
                    charArray[i] == 'A' || charArray[i] == 'E' || charArray[i] == 'I' || charArray[i] == 'O'
                    || charArray[i] == 'U') {
                vowelsSet.add(charArray[i]);
                vowelIndexes.add(i);
            }
        }

        for (int i : vowelIndexes) {
            charArray[i] = vowelsSet.pop();
        }
        return new String(charArray);
    }
}