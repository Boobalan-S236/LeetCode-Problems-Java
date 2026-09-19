class Solution {
    public int[] runningSum(int[] nums) {
       // int prefix[] = new int[nums.length+1];
       // prefix[0]=0;
        for(int i=1;i<nums.length;i++){
           nums[i]=nums[i]+nums[i-1];
        }

        return nums;
    }
}