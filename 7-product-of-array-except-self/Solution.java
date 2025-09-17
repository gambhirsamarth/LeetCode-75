class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nonZeroProduct = 1;
        int noOfZeros = 0;
        for (int number : nums) {
            if (number == 0) {
                noOfZeros++;
                if (noOfZeros > 1)
                    return new int[nums.length];
            } else {
                nonZeroProduct *= number;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (noOfZeros > 0) {
                nums[i] = nums[i] == 0 ? nonZeroProduct : 0;
            } else {
                nums[i] = nonZeroProduct / nums[i];
            }
        }
        return nums;
    }
}