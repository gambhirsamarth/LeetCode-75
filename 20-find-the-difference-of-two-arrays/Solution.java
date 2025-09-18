import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> one = new HashSet<>();
        Set<Integer> two = new HashSet<>();

        for (int number : nums1) {
            one.add(number);
        }

        for (int number : nums2) {
            two.add(number);
        }

        List<Integer> listOne = new ArrayList<>();
        for (int number : one) {
            if (!two.contains(number)) {
                listOne.add(number);
            }
        }

        List<Integer> listTwo = new ArrayList<>();
        for (int number : two) {
            if (!one.contains(number)) {
                listTwo.add(number);
            }
        }

        result.add(listOne);
        result.add(listTwo);

        return result;

    }
}