class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[]=new int[nums.length];
        int leftsum=0,rightsum=0,totalsum=0,diff=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        rightsum=totalsum;

        for(int i=0;i<nums.length;i++){
            rightsum-=nums[i];
            diff=Math.abs(rightsum-leftsum);
            ans[i]=diff;
            leftsum+=nums[i];
        }

        return ans;
    }
}