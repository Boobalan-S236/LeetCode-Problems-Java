class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int r=0,l=0,odd=0,c=0;
        int r2=0,l2=0,odd2=0,c2=0;

        while(r<nums.length){
            if(nums[r]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[l]%2!=0){
                    odd--;
                }
                l++;
            }

            c+=r-l+1;
            r++;
        } 
        while(r2<nums.length){
            if(nums[r2]%2!=0){
                odd2++;
            }
            while(odd2>k-1){
                if(nums[l2]%2!=0){
                    odd2--;
                }
                l2++;
            }

            c2+=r2-l2+1;
            r2++;
        }
        return c-c2;
    }
}