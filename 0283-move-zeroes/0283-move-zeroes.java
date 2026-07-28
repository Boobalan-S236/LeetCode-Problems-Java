class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i< nums.length){
            if(nums[i] != 0){
                nums[j] = nums[i];
                i++;
                j++;
            }
            else i++;
        }
        while(j<nums.length){
            nums[j++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}