public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    } 
    static boolean isPowerOfFour(int n){
     if(n==1) return true;
     return check(n);
    }
    static boolean check(int n ){
        System.out.println(n);
        if(n%4 != 0) return false;
        if(n%10 == n) {    
            if(n == 4) return true;
            else return false;
        }
        return check(n/4);
    }
 }
 