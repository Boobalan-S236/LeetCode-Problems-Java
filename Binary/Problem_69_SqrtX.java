
// Problem: 69. Sqrt(x)
// Link: https://leetcode.com/problems/sqrtx/
// Difficulty:Easy

class Solution {
    public int mySqrt(int x) {
        int start = 1, end = x, ans = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long)mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return ans;
    }
}

