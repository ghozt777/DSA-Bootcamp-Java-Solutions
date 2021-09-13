class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int zeroCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0&&zeroCount==0){
                mul *=1;
                zeroCount++;
            }else if(nums[i]==0) zeroCount++;         
            else{
                mul *=nums[i];
            }
        }
        if(zeroCount>1){
            for(int i = 0;i<nums.length;i++) nums[i] = 0;
            return nums;
        }
        if(zeroCount==1){
            for(int i = 0;i<nums.length;i++){
                if(nums[i]==0) nums[i] = mul;
                else nums[i] = 0;
            }
            return nums;
        }
        if(zeroCount==0){
            for(int i=0;i<nums.length;i++) nums[i] = mul / nums[i];
            return nums;
        }
        return new int[] {-1};
    }
}