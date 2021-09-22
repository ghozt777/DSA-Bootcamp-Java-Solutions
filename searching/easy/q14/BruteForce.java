class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int totalCandy = 0;
        int aliceTotalCandy = 0;
        int bobTotalCandy = 0;
        for(int candy : aliceSizes) totalCandy += candy;
        aliceTotalCandy = totalCandy;
        for(int candy : bobSizes) totalCandy += candy;
        bobTotalCandy = totalCandy - aliceTotalCandy;
        int avg = totalCandy / 2;
        int[] ans = {0,0};
        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(aliceTotalCandy-aliceSizes[i]+bobSizes[j]==avg){
                    ans[0] = aliceSizes[i];
                    ans[1] = bobSizes[j];
                }
            }
        }
        return ans;
    }
}