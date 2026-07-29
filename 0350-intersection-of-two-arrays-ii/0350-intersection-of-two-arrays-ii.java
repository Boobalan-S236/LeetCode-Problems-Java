class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> al = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                al.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else j++;
        }

        int ans[]=new int[al.size()];
        for(int k=0;k<al.size();k++){
            ans[k]=al.get(k);
        }
        return ans;
    }
}