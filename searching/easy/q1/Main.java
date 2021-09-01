import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = findRoot(n);
        System.out.println(ans);
        in.close();
    }
    static int findRoot(int x){
       long start = 0;
       long end = x;
       long mid=0,ans=0;
       while(start<=end){
           mid = start + (end-start)/2;
           if(mid*mid>x){
               end = mid-1;
           }
           else{
               ans = mid;
               start = mid+1;
           }
       }
       return (int)ans;
    }
}
