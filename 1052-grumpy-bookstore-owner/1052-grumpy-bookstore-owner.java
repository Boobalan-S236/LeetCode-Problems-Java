class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l=0,r=minutes-1,sum2=0,sum=0,maxsum=0;

        for(int i=l;i<customers.length;i++){
            if(grumpy[i] == 0){
                sum+=customers[i];
            }
        }
        for(int i=l;i<minutes;i++){
            if(grumpy[i] == 1){
                sum2+=customers[i];
            }
        }
        maxsum=sum2;
        r++;
        while(r<customers.length){
            if(grumpy[r] == 1){
                sum2+=customers[r];
            }

            if(grumpy[l] == 1){
                sum2-=customers[l];
            }
            l++;r++;
            maxsum=Math.max(maxsum,sum2);
        }
        return maxsum+sum;
    }
}