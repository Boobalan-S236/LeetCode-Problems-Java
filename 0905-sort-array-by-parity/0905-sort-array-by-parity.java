class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int slow=0,fast=0;
        while(fast<nums.length){
            if(nums[fast]%2 == 0){
                int temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;
                slow++;
            }
            fast++;
        }

        return nums;
    }
}