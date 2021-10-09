import java.util.Scanner;
import java.lang.String;
class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner in = new Scanner(System.in);
    int decimal = in.nextInt();
    int binary = convertToBinary(decimal);
    String binaryString = convertToBinaryUsingString(decimal);
    System.out.println("binary : " + binary);
    System.out.println("binary in string : " + binaryString);
    in.close(); 
  }
  static int convertToBinary(int num){
    if(num == 0 ) return 0;
    return num%2 + 10*convertToBinary(num/2);
  }
  static String convertToBinaryUsingString(int num){
    return helper(num , "");
  }
  static String helper(int num , String result){
    if(num == 0) return result;
    result = num%2 + result;
    return helper(num/2,result);
  }
}