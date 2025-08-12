class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int pointer = 0;
        while (pointer < Math.min(word1.length(), word2.length())) {
            stringBuilder.append(word1.charAt(pointer));
            stringBuilder.append(word2.charAt(pointer));
            pointer++;
        }
        if (word1.length() < word2.length()) {
            stringBuilder.append(word2.substring(pointer));
        } else {
            stringBuilder.append(word1.substring(pointer));
        }
        return stringBuilder.toString();
    }
}