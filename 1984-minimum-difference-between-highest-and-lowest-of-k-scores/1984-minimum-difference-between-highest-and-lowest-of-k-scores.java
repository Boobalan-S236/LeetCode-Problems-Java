class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
       
        int l=0,r=k-1,min=0,diff=0;
        diff= nums[r]-nums[l];
        min=diff;
        
        while(r<nums.length-1){
            l++;r++;
            diff=nums[r]-nums[l];
            min =Math.min(min,diff);
        }

        return min;
    }
}