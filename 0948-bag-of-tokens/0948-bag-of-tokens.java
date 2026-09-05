class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0,j= tokens.length-1,s=0,max=0;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                s++;
                i++;
            }
            else {
                if(s>=1){
                    power+=tokens[j];
                    s--;
                    j--;
                }else break; // s==0
                
            }

            if(s>max){
                max=s;
            }
        }
        return max;
    }
}