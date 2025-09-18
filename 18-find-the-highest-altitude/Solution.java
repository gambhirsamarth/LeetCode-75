class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int sum = 0;
        for (int number : gain) {
            sum += number;
            result = Math.max(sum, result);
        }
        return result;
    }
}