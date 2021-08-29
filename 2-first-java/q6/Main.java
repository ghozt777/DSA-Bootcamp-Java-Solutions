/*
    Program to take two numbers as input from the user
    and print the largest of the two
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        printGreatest(n1,n2);
    }
    static void printGreatest(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+ " > "+n2);
        }
        else{
            System.out.println(n1+ " < "+n2);
        }
    }
}