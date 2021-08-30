import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] diffAltitude = new int[n];
        for(int i=0;i<n;i++) diffAltitude[i] = in.nextInt();
        int ans = largestAltitude(diffAltitude);
        System.out.print("largest Altitude is : " + ans);       
    }
    static int largestAltitude(int[] diffAltitude){
        int altitude = 0;
        int maxAltitude = 0;
        for(int i=0;i<diffAltitude.length;i++){
            altitude += diffAltitude[i];
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        return maxAltitude;
    }
}