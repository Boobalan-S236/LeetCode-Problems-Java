class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int s =0,f=1;
        while(f<nums.length && s<nums.length){
            
            if(nums[s]%2 == 0){
                s+=2;
            }

            else if(nums[f]%2 !=0)
                f+=2;

            else {
                int t=nums[f];
                nums[f]=nums[s];
                nums[s]=t;
            }   
        }
        return nums;
    }
}