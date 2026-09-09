class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0,maxsum=0,sh=k-1;;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxsum=sum;
        int n=cardPoints.length-1;
        while(sh>=0){
            sum-=cardPoints[sh];
            sh--;
            sum+=cardPoints[n];
            n--;
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}