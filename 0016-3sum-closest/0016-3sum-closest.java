class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int check=0,min=Integer.MAX_VALUE,sum=0,ans=0;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                sum = nums[i]+nums[l]+nums[r];
                check=Math.abs(sum-target);
                if(check<min){
                    min = check;
                    ans=sum;
                }
                if(sum<target){
                    l++;
                }
                else r--;

            }
        }
        return ans;
    }
}