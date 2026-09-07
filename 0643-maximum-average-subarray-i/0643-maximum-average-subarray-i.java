class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k-1;
        double sum=0;
        double maxavg=0,avg=0;
      
        for(int i=l;i<k;i++){
            sum+=nums[i];
        }
        maxavg=avg=sum/k;
        while(r<nums.length-1){
            sum-=nums[l];
            l++;r++;
            sum+=nums[r];
            avg=sum/k;
            maxavg=Math.max(avg,maxavg);
        }

        return maxavg;
    }
}