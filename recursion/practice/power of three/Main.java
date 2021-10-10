public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(19684));
    } 
    static boolean isPowerOfThree(int n){
     if(n==1) return true;
     return check(n);
    }
    static boolean check(int n ){
        if(n%3!=0) return false;
        System.out.println(n);
        if(n%10 == n) {    
            if(n == 3 || n == 9) return true;
            else return false;
        }
        return check(n/3);
    }
 }
 