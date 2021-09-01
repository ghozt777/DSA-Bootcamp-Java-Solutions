import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str ;
        System.out.print("Enter a String with no spaces : ");
        str = in.next();
        System.out.print("Enter a char to search : ");
        char target = in.next().charAt(0);// thats how you input a charecter you just input astring and assign the first charecter using charAt(0) mehthod to the variable
        boolean ans = findChar1(str,target);
        System.out.println("Ans using findChar1 : " + ans);
        System.out.println("Ans using findChar2 : " + findChar2(str,target));
        in.close();
    }
    static boolean findChar1(String str,char target){
        if(str.length() == 0) return false;
        // notice how we used .length() method and not a .length variable in case of an array
        // Type 1:
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target) return true;
        }
        return false;
    }
    static boolean findChar2(String str,char target){
        // Type 2 using a forEach Loop
        for(char ch : str.toCharArray()){
            // the String.toCharArray() method converts a String to its corresponding charecter array
            if(ch==target) return true;
        }
        return false;
    }

}