class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
          int l=0,r=k-1,sum=0,avg=0,c=0;
          for(int i=l;i<k;i++){
            sum+=arr[i];
          }
          avg=sum/k;
          if(avg>=threshold){
            c++;
          }
          while(r<arr.length-1){
            sum-=arr[l];
            l++;r++;
            sum+=arr[r];
            avg=sum/k;
            if(avg>=threshold){
                c++;
            }
        }
        return c;
    }
}