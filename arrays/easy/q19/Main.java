import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] logs = new int[n][2];
        for(int i=0;i<n;i++)
            for(int j=0;j<2;j++)
                logs[i][j] = in.nextInt();
        int maxYear = maximumPopulation(logs);
        System.out.print(maxYear);
    }
    static int maximumPopulation(int[][] logs){
        int[] yearLog = new int[101];
        // yearLog represent the net difference as compoapred to the prev year
        // hence yearLog[i] = polulation[i] - population[i-1] 
        // i here represent the year - 1950
        for(int[] log : logs){
            yearLog[log[0]-1950]++; // increment the net difference for every birth log[0] -> birth

            yearLog[log[1]-1950]--; // decrement the net difference for every death log[1] -> death
        }
        int maxPopulation = yearLog[0];
        int maxYear = 1950; 
        for(int i=1;i<yearLog.length;i++){
            yearLog[i] += yearLog[i-1];
            if(yearLog[i]>maxPopulation){
                maxPopulation = yearLog[i];
                maxYear = 1950 + i;
            }
        }
        return maxYear;
    }
}
