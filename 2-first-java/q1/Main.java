/*
            In this program there are two functions to calculate the 
            factorial of number that the user inputs :
            1. The first one uses iteration 
            2. The second one uses recursion
*/

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        int ans1 = calFactorialUsingIteration(n);
        int ans2 = calFactorialUsingRecursion(n);
        System.out.println("Answer using iteration: "+ans1+" Answer using recursion: "+ans2);
        in.close();
    }
    static int calFactorialUsingIteration(int n){
        int ans = 1;
        for(int i=n;i>=1;i--) ans *= i;
        return ans;
    }
    static int calFactorialUsingRecursion(int n){
        return n>1?n*calFactorialUsingRecursion(n-1):1;
    }
}
