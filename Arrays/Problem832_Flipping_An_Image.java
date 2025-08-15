
// Problem: 832. Flipping an Image
// Link: https://leetcode.com/problems/flipping-an-image/
// Difficulty:Easy

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
          for (int[] r : image) {
            int i = 0, j = r.length - 1;
            while (i <= j) { 
                int temp = 1 - r[i];
                r[i] = 1 - r[j];
                r[j] = temp;

                i++;
                j--;
            }
        }
        return image;
    }
}
