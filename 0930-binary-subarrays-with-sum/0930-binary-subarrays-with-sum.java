class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int r=0,l=0,sum=0,count=0;
        int r2=0,l2=0,sum2=0,count2=0;
        
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=r-l+1;
            r++;
        }
    
      //  System.out.println(count);
        if(goal == 0) return count;
        while(r2<nums.length){
            sum2+=nums[r2];
            while(sum2>goal-1){
                sum2-=nums[l2];
                l2++;
            }
            count2+=r2-l2+1;
            r2++;
        }

        return count-count2;
    }
}