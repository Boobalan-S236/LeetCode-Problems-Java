
// Problem: 540. Single Element in a Sorted Array
// Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
// Difficulty:Medium

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start =0,end=nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid] == nums[mid+1]){
                start=mid+2;
            }else end= mid;
        }
        return nums[start];

    }
}

