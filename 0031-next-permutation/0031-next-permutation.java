class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                System.out.print("ind");
                break;
            }
        }
        if(ind == -1){
            int i=0,j=nums.length-1;
                while(i<j){
                int t = nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;j--;
               
            }
            return;
        }
        // System.out.print("no ind");

        System.out.print(ind);
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int t = nums[i];
                nums[i]=nums[ind];
                nums[ind]=t;
                break;
            }
        }
        int i=ind+1,j=nums.length-1;
        while(i<j){
            int t = nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;j--;
        }
    }
}