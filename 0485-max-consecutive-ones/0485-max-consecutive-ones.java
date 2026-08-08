class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0,count=0,max=0;
        while(i<nums.length){
            if(nums[i] == 1){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else{
            
                count=0;
            }
            i++;
        }
        return max;
    }
}