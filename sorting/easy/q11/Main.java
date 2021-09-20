class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]%2==1){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
            else start++;
        }
        return nums;
    }
}