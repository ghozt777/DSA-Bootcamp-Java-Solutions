/*
    Program to calculate SI from P,T,R taken as 
    user input
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter P : ");
        int P = in.nextInt();
        System.out.print("Enter R : ");
        int R = in.nextInt();
        System.out.print("Enter T : ");
        int T = in.nextInt();
        int SI = getSI(P,R,T);
        System.out.println("SI is : "+ SI);
    }
    static int getSI(int P,int R, int T){
        return P*R*T;
    }
}