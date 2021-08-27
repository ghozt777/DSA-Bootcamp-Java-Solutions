class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int count1=0,count2=0;
        for(int i=0;i<2*n;i++){
           if(i%2==0) ans[i] = nums[count1++];
           else ans[i] = nums[n + count2++]; 
        }
        return ans;
    }
}