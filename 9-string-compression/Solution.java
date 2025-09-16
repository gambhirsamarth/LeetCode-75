class Solution {
    public int compress(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int pointer = i + 1;
            int count = 1;
            while (pointer < chars.length && chars[i] == chars[pointer]) {
                count++;
                pointer++;
            }
            stringBuilder.append(chars[i]);
            stringBuilder.append(count > 1 ? count : "");
            i = pointer - 1;
        }

        for(int i=0; i<stringBuilder.length(); i++){
            chars[i] = stringBuilder.charAt(i);
        }

        return stringBuilder.length();
    }
}