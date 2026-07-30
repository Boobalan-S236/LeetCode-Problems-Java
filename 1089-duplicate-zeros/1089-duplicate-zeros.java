class Solution {
    public void duplicateZeros(int[] arr) {
        int j=0,i=0;
        int t[]=new int[arr.length];
        while(i<arr.length && j<t.length){
            if(arr[i] != 0){
                t[j] = arr[i];
                j++;
                i++;
            }
            else if(arr[i] == 0){
                t[j] = arr[i];
                if(j+1 < t.length){  
                    t[j+1] = 0;
                }
                i++;
                j=j+2;
            }
        }
        for(int k=0;k<t.length;k++){
            arr[k]=t[k];
        }
    }
}