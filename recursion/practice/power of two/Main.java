

public class Main {
   public static void main(String[] args) {
       System.out.println(isPowerOfTwo(17));
   } 
   static boolean isPowerOfTwo(int n){
    if(n==1) return true;
    return check(n);
   }
   static boolean check(int n ){
       if(n%2 == 1) return false;
       if(n%10 == n) {    
           if(n == 2 || n == 4 || n == 8) return true;
           else return false;
       }
       return check(n/2);
   }
}
