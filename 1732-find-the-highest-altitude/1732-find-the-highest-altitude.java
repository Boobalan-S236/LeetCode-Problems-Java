class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int prefix[]=new int[gain.length+1];

        for(int i=0;i<prefix.length-1;i++){
            prefix[i+1]=prefix[i]+gain[i];
        }
        for(int i=0;i<prefix.length;i++){
            max=Math.max(max,prefix[i]);
        }
        return max;
    }
}