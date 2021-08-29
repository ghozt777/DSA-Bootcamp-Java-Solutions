/*
    Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.print("Enter three numbers: ");
        for(int i=0;i<3;i++) nums[i] = in.nextInt();
        int min = getMin(nums);
        int max = getMax(nums);
        System.out.println("amongst the numbers "+ Arrays.toString(nums) + " the maximum is : "+max+" and the minimum is : "+ min);
    }
    static int getMin(int[] nums){
        int min = nums[0];
        for(int i=1;i<nums.length;i++) if(nums[i]<min) min=nums[i];
        return min;
    }
    static int getMax(int[] nums){
        int max = nums[0];
        for(int i=1;i<nums.length;i++) if(nums[i]>max) max=nums[i];
        return max;
    }
}