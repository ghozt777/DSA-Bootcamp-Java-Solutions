/*
    Define a program to find out whether a given number is even or odd.
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        boolean isEven = checkIsEven(num);
        if(isEven) System.out.println(num + " is a even number") ;
        else System.out.println(num + " is an odd number");
    }
    static boolean checkIsEven(int num){
        return num%2==0;
    }
}