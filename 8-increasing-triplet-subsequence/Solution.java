class Solution {
    public boolean increasingTriplet(int[] nums) {
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;

        for (int number : nums) {
            if (number <= minOne) {
                minOne = number;
            } else if (number <= minTwo) {
                minTwo = number;
            } else {
                return true;
            }
        }
        return false;
    }
}