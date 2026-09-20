class Solution {
    public int findMiddleIndex(int[] nums) {
        int rs=0,ls=0,ts=0;
        for(int i=0;i<nums.length;i++){
            ts+=nums[i];
        }
        rs=ts;
        for(int i=0;i<nums.length;i++){
            rs-=nums[i];
            if(ls == rs){
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}