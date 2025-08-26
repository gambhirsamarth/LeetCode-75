class Solution {
    public void moveZeroes(int[] nums) {

        int[] temp = new int[nums.length];

        int index = 0;
        for(int number : nums){
            if(number == 0) continue;
            temp[index++] = number;
        }

        for(int i=0;i<nums.length; i++){
            nums[i] = temp[i];
        }
    }
}