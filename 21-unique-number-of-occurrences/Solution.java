import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.values().size();
    }
}