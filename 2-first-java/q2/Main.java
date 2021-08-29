/*
    Program to check wether a give number is even or odd
    taken as a input from the user
*/


import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = in.nextInt();
        boolean isEven = checkIsEven(n);
        System.out.println(isEven);
    }
    static boolean checkIsEven(int n){
        return n%2==0;
    }
}