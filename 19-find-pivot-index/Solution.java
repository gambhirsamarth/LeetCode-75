class Solution {
    public int pivotIndex(int[] nums) {
        int totalArraySum = 0;
        for (int number : nums) {
            totalArraySum += number;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalArraySum - leftSum - nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}