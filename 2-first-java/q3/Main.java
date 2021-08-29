/*
    Program to take user's name as input and print a 
    personalized gretting message
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Waccha Name Buddy: ");
        String name = in.next();
        String grettingMessage = generateGreetingMessage(name);
        System.out.println(grettingMessage);
    }
    static String generateGreetingMessage(String name){
        return "Hello "+name+" How u doing ;)";
    }
}