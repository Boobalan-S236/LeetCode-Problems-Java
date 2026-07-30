class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int m=arr[j]*2;
                if(i != j)
                    if(m == arr[i]) return true;
            }
        }
        return false;
    }
}
 
