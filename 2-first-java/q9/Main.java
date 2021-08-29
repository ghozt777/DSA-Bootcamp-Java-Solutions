/*
    Program where the user input numbers until
    till 0 is encountered and the program prints the sum of
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
        int sum = genSum(nums);
        System.out.println("The sum of "+ Arrays.toString(nums.toArray()) + "is = "+sum);
    }
    static int genSum(List<Integer> nums){
        int sum = 0;
        for(int i=0;i<nums.size();i++) sum += nums.get(i);
        return sum;
    }
}