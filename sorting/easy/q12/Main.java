class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] temp = new int[nums.length];
        int eStart = 0;
        int oStart = 1;
        for(int num : nums){
            if(num%2==0){
                temp[eStart] = num;
                eStart += 2;
            }
            else{
                temp[oStart] = num;
                oStart += 2;
            }
        }
        return temp;
    }
}