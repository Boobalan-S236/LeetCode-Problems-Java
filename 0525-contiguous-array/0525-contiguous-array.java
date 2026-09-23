class Solution {
    public int findMaxLength(int[] nums) {
        int maxlen=0,ps=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        System.out.print(Arrays.toString(nums));
        for(int i=0;i<=nums.length-1;i++){
            ps+=nums[i];
            if(hm.containsKey(ps)){
                maxlen=Math.max(maxlen,i-hm.get(ps));
            }
            else hm.put(ps,i);
        }
        return maxlen;
    }
}