class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int r=0,l=0,c=0;
        int r2=0,l2=0,c2=0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();

        while(r<nums.length){

            if(hm.containsKey(nums[r])){
                hm.put(nums[r],hm.get(nums[r])+1);
            }
            else hm.put(nums[r],1);

            while(hm.size() > k){
                hm.put(nums[l],hm.get(nums[l])-1); 
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }

            if(hm.size()<=k){
                c+=r-l+1;
            }
            r++;
        }

        while(r2<nums.length){
            if(hm2.containsKey(nums[r2])){
                hm2.put(nums[r2],hm2.get(nums[r2])+1);
            }
            else hm2.put(nums[r2],1);

             while(hm2.size() > k-1){
                hm2.put(nums[l2],hm2.get(nums[l2])-1); 
                if(hm2.get(nums[l2])==0){
                    hm2.remove(nums[l2]);
                }
                l2++;
            }
            
            if(hm2.size()<=k-1){
                c2+=r2-l2+1;
            }
           
            r2++;
        }

        return c-c2;
    }
}