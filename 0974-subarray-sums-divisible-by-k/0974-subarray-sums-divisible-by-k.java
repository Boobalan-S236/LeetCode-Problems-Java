class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ps=0,c=0;
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            ps+=nums[i];
            int rem = ps%k;
            if(rem<0){
                rem+=k;
            }
            c+=hm.getOrDefault(rem,0);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return c;
    }
}