class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        int l=0,r=0,len=0,maxlen=0;
        while(r<fruits.length){

            if(hm.containsKey(fruits[r])){
                hm.put(fruits[r],hm.get(fruits[r])+1);
            }else hm.put(fruits[r],1);

            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l]) == 0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            len=r-l+1;
            maxlen=Math.max(len,maxlen);
            r++;
        }
        return maxlen;
    }
}