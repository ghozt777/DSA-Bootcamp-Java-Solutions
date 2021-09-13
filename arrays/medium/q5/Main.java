class Solution {
    public void rotate(int[] nums, int k) {
         k %= nums.length;
         int[] temp = new int[nums.length];
         for(int i=0;i<nums.length;i++){
             temp[(i+k)%nums.length] = nums[i];
         }
        for(int i=0;i<nums.length;i++)
            nums[i] = temp[i];
    }
}