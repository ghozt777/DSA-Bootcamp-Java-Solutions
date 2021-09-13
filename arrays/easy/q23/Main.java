class Solution {
    public List<Integer> luckyNumbers (int[][] arr) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int min = arr[i][0];
            int minIndex = 0;
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    minIndex = j;
                }
            }
            int max = arr[0][minIndex];
            for(int j=1;j<arr.length;j++){
                if(arr[j][minIndex]>max){
                    max = arr[j][minIndex];
                }
            }
            if(min==max) ans.add(min);
        }
        return ans;
    }
}