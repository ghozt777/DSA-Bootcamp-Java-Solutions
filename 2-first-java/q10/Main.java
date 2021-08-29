/*
    Program where the user input numbers until
    till 0 is encountered and the program prints the largest of
    all the numbers from the user
*/

import java.util.*;
class Main{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int ip = 1;
        System.out.print("Enter numbers u want to add up to stop inputting numbers press 0: ");
        while(ip!=0){
            ip = in.nextInt();
            nums.add(ip);
        }
        int max = getMax(nums);
        System.out.println("The sum of "+ Arrays.toString(nums.toArray()) + "is = "+max);
    }
    static int getMax(List<Integer> nums){
        int max = nums.get(0);
        for(int i=1;i<nums.size();i++) if(nums.get(i)>max) max=nums.get(i);
        return max;
    }
}