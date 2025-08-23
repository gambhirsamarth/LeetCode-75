import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> vowelsSet = new Stack<>();
        Set<Integer> vowelIndexes = new HashSet<>();

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


    public static void main(String[] args) {
        String test = "A man, a plan, a canal: Panama";
        System.out.println(reverseVowels(test));
    }
}