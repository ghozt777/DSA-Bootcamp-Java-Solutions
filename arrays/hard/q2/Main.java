class Solution {
    public int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i<arr.length){
            if(arr[i]>0&&arr[i]<=arr.length&&arr[i]!=(i+1)&&arr[i]!=arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++) if(arr[i]!=(i+1)) return i+1;
        return arr.length+1;
    }
}