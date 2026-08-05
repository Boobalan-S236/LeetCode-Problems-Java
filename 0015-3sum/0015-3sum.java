class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<ArrayList<Integer>> hs = new HashSet<>();

        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];

                if(sum == 0){
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[l]);
                    t.add(nums[r]);

                    hs.add(t);
                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                else r--;
            }
        }
        return new ArrayList<>(hs);
    }
}