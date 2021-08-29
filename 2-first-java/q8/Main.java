/*
    Program that takes rupees as input from the user
    and calculates its equivalent value in USD
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in ₹ : ");
        int rupees = in.nextInt();
        double dollars = getDollarBillsBaby(rupees);
        System.out.println("₹ "+rupees+" -> "+" $ "+dollars);
    }
    static double getDollarBillsBaby(int rupees){
        return 0.014*rupees;
        // this is as of today's date may not be valid when the program is running
    }
}