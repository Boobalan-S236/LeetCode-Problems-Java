// Problem: 48. Rotate Image
// Link: https://leetcode.com/problems/rotate-image
// Difficulty: Medium

class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
        for(int row=0;row<matrix.length;row++){
            int i=0,j=matrix.length-1;
            while(i<j){
                int temp=matrix[row][i];
                matrix[row][i]=matrix[row][j];
                matrix[row][j]=temp;
                i++;
                j--;
            }
        }
        for(int ans[]:matrix){
            System.out.print(Arrays.toString(ans));
        }
        
    }
}
