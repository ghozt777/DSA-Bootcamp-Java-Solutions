import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a String");
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    System.out.print("The reversed String is(returned by method 1) : ");
    printInReverse(str);
    String reversedString = reverse(str);
    System.out.println("The returned string is(returned by method 2) : " + reversedString);
    System.out.println("The returned string is(returned by method 3) : " + anotherReverse(str));
    in.close();
  }


  // Method 1:
  // This function prints the String in revrse
  static void printInReverse(String str){
    helper(str,str.length()-1);
  }
  static void helper(String str, int n){
    if(n==0){ 
      System.out.print(str.charAt(0));
      System.out.println();
    }
    else {
      System.out.print(str.charAt(n));
      helper(str,n-1);
    }
   
  }


  // Method 2:
  // Function that returns the reversed String
  static String reverse(String str){
    if(str.equals("")) return "";
    return reverse(str.substring(1)) + str.charAt(0); 
  }

  // Method 3:
  // slight variation of the above code for the base condition
  static String anotherReverse(String str){
    if(str.length()==1) return String.valueOf(str.charAt(0));
    return anotherReverse(str.substring(1)) + str.charAt(0);
  }
}