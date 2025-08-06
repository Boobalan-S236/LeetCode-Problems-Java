
// Problem: 75- Sort_Colors
// Link: https://leetcode.com/problems/sort-colors
// Difficulty: Medium

class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){low++;}
            else if(nums[i]==1){mid++;}
            else if(nums[i]==2){high++;}
        }
        for(int i=0;i<low;i++){
            nums[i]=0;
        }
        for(int i=low;i<low+mid;i++){
            nums[i]=1;
        }
        for(int i=low+mid;i<nums.length;i++){
            nums[i]=2;
        }
        for(int a:nums){
            System.out.print(a);
        }
    }
}
