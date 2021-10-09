import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a String : ");
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    System.out.println("ans : " + isPallindrome(str));
    in.close();
  }
  static boolean isPallindrome(String str){
    if(str.length() == 1 || str.length() == 0) return true;
    if(str.charAt(0) == str.charAt(str.length() - 1)){
      return isPallindrome(str.substring(1 , str.length() - 1));
    }
    return false;
  }
}