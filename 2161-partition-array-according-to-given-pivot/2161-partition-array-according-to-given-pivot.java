class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int ind=0;
        for(int a:nums){
            if(a < pivot)
                ans[ind++]=a;
        }
        for(int a:nums){
            if(a==pivot)
                ans[ind++]=a;
        }
        for(int a:nums){
            if(a>pivot)
                ans[ind++]=a;
        }
        return ans;
    }
}