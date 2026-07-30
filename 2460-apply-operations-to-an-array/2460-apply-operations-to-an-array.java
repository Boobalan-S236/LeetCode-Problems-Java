class Solution {
    public int[] applyOperations(int[] nums) {
        int slow=0,fast=1;
        while(fast<nums.length){
            if(nums[slow] == nums[fast]){
                nums[slow]=nums[slow]*2;
                nums[fast]=0;
                slow++;
                fast++;
            }
            else {
                slow++;
                fast++;
            }
        }
        slow=0;fast=0;
        System.out.println(slow +""+fast);
        while(fast<nums.length){
            if(nums[fast] != 0){
                int temp = nums[fast];
                nums[fast]=nums[slow];
                nums[slow] = temp;
                slow++;
                fast++;
            }
            else fast++;
        }

        return nums;
    }
}