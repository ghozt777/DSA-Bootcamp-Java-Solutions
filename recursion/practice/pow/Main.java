// ans is right but getting a stack overfkow error
public class Main {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000,-2));
    }
    static double myPow(double x , int n){
        if(n==0) return 1.00000;
        if(n<0) return handleNegativePower(x, n, 1);
        return handlePositivePower(x, n, 1);
    }
    static double handlePositivePower(double x , int n, double ans){
        if(n == 0) return ans;
        return handlePositivePower(x, n - 1, ans*x);
    }
    static double handleNegativePower(double x , int n, double ans){
        if(n == 0) return ans;
        return handleNegativePower(x, n + 1, ans/x);
    }
}
