
// Problem: 34. Find First and Last Position of Element in Sorted Array
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Difficulty:Medium

class Solution {

    public int findlb(int[] nums,int target){
        int index=-1,start=0,end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start =mid+1;
            }else
                end=mid-1;
        }
        return index;
    }
        public int findrb(int[] nums,int target){
        int index=-1,start=0,end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start =mid+1;
            }else
                end=mid-1;
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
      int left =findlb(nums,target);
      int right = findrb(nums,target);
      return new int[]{left,right};
    }
}
