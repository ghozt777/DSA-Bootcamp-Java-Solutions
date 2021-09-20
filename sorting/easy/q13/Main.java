class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==3&&nums[0]+nums[1]<=nums[2]) return 0;
        int i = nums.length-1;
        while(i>=2){
            if(nums[i-2]+nums[i-1]<=nums[i]) i--;
            else return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
}