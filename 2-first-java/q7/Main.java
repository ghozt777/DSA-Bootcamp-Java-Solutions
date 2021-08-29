/*
    Takes a number as a user intput
    and prints all the factors
*/

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        Object[] factors = getFactors(n).toArray();
        System.out.println("The factors are: "+ Arrays.toString(factors));
    }
    static List<Integer> getFactors(int n){
        List<Integer> factors = new ArrayList<>();
        int potentialFactor = 1;
        while(potentialFactor<n){
            if(n%potentialFactor==0) factors.add(potentialFactor);
            potentialFactor++;
        }
        return factors;
    }
}