class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        k= k % nums.length;
        int tp = nums.length-k;
        int size=k;
        for(int i=tp;i<nums.length;i++){
            al.add(nums[i]);
        }
        int j=tp-1;
        for(int i=j;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for(int i=0;i<al.size();i++){
            nums[i]=al.get(i);
        }
    }
}