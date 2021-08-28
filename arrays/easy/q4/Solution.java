class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum;
        for(int[] person : accounts){
            sum = 0;
            for(int wealth : person) sum += wealth;
            max = Math.max(max,sum);
        }
        return max;
    }
}