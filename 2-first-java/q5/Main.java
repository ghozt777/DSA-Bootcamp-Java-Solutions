/*
    Program that calculates resule based on two oerands and a 
    operation taken as user input
*/

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.print("Enter a operator (+,-,*,/,%)");
        char op = in.next().charAt(0);
        int res = getResult(n1,n2,op);
        if(res!=Integer.MIN_VALUE)System.out.println(n1 +" " +op+" " + n2 + " = "+res); 
        else System.out.print("Invalid operator used failed to generate a result");
    }
    static int getResult(int n1, int n2 , char op){
        switch(op){
            case '-':
            return n1-n2;
            case '+':
            return n1+n2;
            case '*':
            return n1*n2;
            case '/':
            return n1/n2;
            case '%':
            return n1%n2;
            default:
            return Integer.MIN_VALUE;
        }
    }
}