class Solution {
    public int sumOfUnique(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length-1]) return 0;
        int sum = 0;
        int duplicateNumber = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]&&nums[i]!=duplicateNumber) sum+=nums[i];
            else duplicateNumber = nums[i];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]) sum+=nums[nums.length-1];
        return sum;
    }
}