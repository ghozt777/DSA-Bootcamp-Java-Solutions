class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int mul1 = nums[0]*nums[1]*nums[n];
        int mul2 = nums[n]*nums[n-1]*nums[n-2];
        return mul1 >= mul2 ? mul1 : mul2;
    }
}