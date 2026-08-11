class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int s1=nums[j] - nums[i];
                    int s2=nums[k] - nums[j];
                    
                    if(i!=j && j!=k && k!=i){
                        if((s1 == diff) && (s2 == diff)){
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }
}