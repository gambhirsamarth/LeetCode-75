import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() == word2.length()) {

            Map<Character, Integer> charMapOne = new HashMap<>();
            Map<Character, Integer> charMapTwo = new HashMap<>();

            for (int i = 0; i < word1.length(); i++) {
                charMapOne.put(word1.charAt(i), charMapOne.getOrDefault(word1.charAt(i), 0) + 1);
            }

            for (int i = 0; i < word2.length(); i++) {
                charMapTwo.put(word2.charAt(i), charMapTwo.getOrDefault(word2.charAt(i), 0) + 1);
            }

            Set<Character> charactersOne = charMapOne.keySet();
            Set<Character> charactersTwo = charMapTwo.keySet();

            if (charactersOne.containsAll(charactersTwo) && charactersTwo.containsAll(charactersOne)) {
                for (Character character : charactersOne) {
                    if (charMapTwo.values().contains(charMapOne.get(character))) {
                        charMapTwo.values().remove(charMapOne.get(character));
                        continue;
                    }
                    return false;
                }
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
}