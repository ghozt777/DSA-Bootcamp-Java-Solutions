class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++) temp[i] = arr[i];
        Arrays.sort(temp);
        int start = 0;
        int end = temp.length-1; 
        while(start<=end){
            int sum = temp[start]+temp[end];
            if(sum<target) start++;
            if(sum>target) end--;
            if(sum == target){
               break;
            }
        }
        boolean isThereAStart = false;
        for(int i=0;i<arr.length;i++){
            if(!isThereAStart) if(arr[i] == temp[start]) {ans[0] = i; isThereAStart = true;}
            if(arr[i] == temp[end]) ans[1] = i;
        }
        return ans;
    }
}