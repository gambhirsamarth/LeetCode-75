class Solution {
    public String gcdOfStrings(String str1, String str2) {
        for (int i = Math.min(str1.length(), str2.length()); i > 0; i--) {
            String candidate = str1.substring(0, i);
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();

                for (int j = 0; j < str1.length() / i; j++) {
                    sb1.append(candidate);
                }

                for (int j = 0; j < str2.length() / i; j++) {
                    sb2.append(candidate);
                }

                if (sb1.toString().equals(str1) && sb2.toString().equals(str2)) {
                    return candidate;
                }
            }
        }
        return "";
    }
}