class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        Set<ArrayList<Integer>> hs = new HashSet<>();
        ArrayList<Integer> al= new ArrayList<>();


        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                
                int l=j+1,r=nums.length-1;

                while(l<r){
                    long sum = (long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum == target){
                        ArrayList<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);
                        
                        hs.add(temp);                        
                        l++;r--;
                        
                    }
                    else if(sum<target){
                        l++;
                    }
                    else r--;
                }
            }
        }
        return new ArrayList<>(hs);
    }
}