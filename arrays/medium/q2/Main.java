class Solution {
    public void setZeroes(int[][] arr) {
       List<Integer> indexPairs = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    indexPairs.add(i);
                    indexPairs.add(j);
                }
            }
        }
        for(int i=0;i<indexPairs.size();i+=2){
            int row = indexPairs.get(i);
            int column = indexPairs.get(i+1);
            for(int j=0;j<arr[row].length;j++) arr[row][j] = 0;
            for(int j=0;j<arr.length;j++) arr[j][column] = 0;
        }
    }
}