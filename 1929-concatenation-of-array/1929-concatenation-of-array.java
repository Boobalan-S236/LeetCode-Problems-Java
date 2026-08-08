class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n*2];
        int index=0;
        for(int i=0;i<nums.length;i++){
            ans[index++]=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            ans[index++]=nums[j];
        }

        return ans;
    }
}