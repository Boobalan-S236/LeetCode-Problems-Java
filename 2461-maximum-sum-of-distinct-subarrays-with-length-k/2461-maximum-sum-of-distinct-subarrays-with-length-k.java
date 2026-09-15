class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0,r=k-1;
        long sum=0,maxsum=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=l;i<k;i++){
            sum+=nums[i];
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else hm.put(nums[i],1);
        }
        if(hm.size() == k){
            maxsum=sum;
        }

        while(r<nums.length-1){
            sum-=nums[l];
            hm.put(nums[l],hm.get(nums[l])-1);
            if(hm.get(nums[l]) == 0){
                hm.remove(nums[l]);
            }

            l++; 
            r++;
            
            sum+=nums[r];
            
            if(hm.containsKey(nums[r])){
                hm.put(nums[r],hm.get(nums[r])+1);
            }
            else hm.put(nums[r],1);

            if(hm.size() == k){
                maxsum=Math.max(sum,maxsum);
            }
        }

        return maxsum;
    }
}