
// Problem: 81. Search in Rotated Sorted Array II
// Link: https://leetcode.com/problems/search-in-rotated-array-ii/
// Difficulty:Medium

class Solution {
    public boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(nums[mid] == target){
                return true;
            }
            else if(nums[start]==target && nums[end] == target){
                start=mid+1;
                end =mid-1;
                continue;
            }
            else if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<=nums[mid] ){
                    end=mid-1;
                }else start=mid+1;
            }
            else {
                if(nums[mid]<=target && target<=nums[end] ){
                    end=mid-1;
                }else start=mid+1;
            }

    }
    return false;
}
}
