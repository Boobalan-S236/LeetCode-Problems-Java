class Solution {
    public int[] decrypt(int[] code, int k) {
       // int a[]= {2,4,9,3},k=-2;
		int ans[]=new int[code.length];
		int p=0,l=p+1,r=k,sum=0;

		if(k>0) {
			for(int i=l;i<=r;i++) {
				sum+=code[i];
			}
			ans[p]=sum;
			while(p<code.length-1) {
				sum-=code[l];
				p++;r++;l++;
				if(r>=code.length) {
					r=0;
				}
				if(l>=code.length) l=0;
				sum+=code[r];
				ans[p]=sum;
			}
            return ans;
		}
		else if(k<0) {
			int n=Math.abs(k);
			int p2=0,l2=code.length-n,r2=code.length-1,sum2=0;
			for(int i=l2;i<=r2;i++) {
				sum2+=code[i];
			}
			ans[p2]=sum2;
			while(p2<code.length-1) {
				sum2-=code[l2];
				p2++;l2++;r2++;
				if(r2>=code.length) r2=0;
				if(l2>=code.length) l2=0;
				sum2+=code[r2];
				ans[p2]=sum2;
			}
			return ans;
		}
		return ans;
    }
}