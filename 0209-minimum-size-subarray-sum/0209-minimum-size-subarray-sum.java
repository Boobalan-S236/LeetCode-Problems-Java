class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r=0,l=0,sum=0,len=0,minlen=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                len=r-l+1;
                sum-=nums[l];
                l++;
                minlen=Math.min(minlen,len);
            }
            r++;
        }
        if(minlen == Integer.MAX_VALUE)
            return 0;
        else return minlen;
    }
}