class Solution {
    public int[] sumZero(int n) {
        if(n==1) return new int[] {0};
        if(n==2) return new int[] {-1,1};
        int[] ans = new int[n];
        for(int i=0;i<n-1;i++){
            ans[i] = i;
        }
        ans[n-1] = -1*(n-1)*(n-2)/2;
        return ans;
    }
}