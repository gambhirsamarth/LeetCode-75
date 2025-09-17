import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> numberToFrequencyMap = new HashMap<>();
        int result = 0;
        for (int number : nums) {
            int freq = numberToFrequencyMap.getOrDefault((k - number), 0);
            if (freq > 0) {
                result++;
                numberToFrequencyMap.put(k - number, freq - 1);
                continue;
            }
            numberToFrequencyMap.put(number, numberToFrequencyMap.getOrDefault(number, 0) + 1);
        }
        return result;
    }
}