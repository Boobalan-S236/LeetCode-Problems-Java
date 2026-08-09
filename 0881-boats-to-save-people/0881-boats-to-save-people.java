class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int i=0,j=people.length-1,boat=0;
        while(i<=j){
            int sum =people[i]+people[j];
            if(sum<=limit){
                boat++;
                i++;j--;
            }
            else if(people[i]<people[j]){
                if(people[j]<=limit){
                    boat++;
                }
                j--;
            }
            else{
                if(people[i]<limit){
                    boat++;
                }
                i++;
            }
        }

        return boat;
    }
}