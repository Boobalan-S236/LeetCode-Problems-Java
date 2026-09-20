class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int l=0,sum=0;
        int p[]=new int[arr.length+1];

        for(int i=0;i<p.length-1;i++){
            p[i+1]=p[i]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                l=j-i+1;
                if(l%2 != 0){
                    sum+=p[j+1]-p[i];
                }
            }
        }
        return sum;
    }
}