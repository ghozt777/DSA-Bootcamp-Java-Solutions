/*
    A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
*/

import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Yo dude enter ur age: ");
        int age = in.nextInt();
        if(age>=100) System.out.print("Yo ma man you old bish take some rest probably voting can be done later k ?");
        boolean isOldEnough = checkIfIsOldEnough(age);
        if(isOldEnough) System.out.println("You sir/mam can vote :)");
        else System.out.println("ERR dude u are too young to vote :(");
    }
    static boolean checkIfIsOldEnough(int age){
        return age>=18;
    }
}