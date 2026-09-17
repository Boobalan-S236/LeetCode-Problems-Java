class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,r=0,zero=0,c=0;
        while(r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            while(zero>1){
                if(nums[l] == 0)
                    zero--;
                l++;
            }
            c=Math.max(c,r-l);

            r++;
        }

        return c;
    }
}