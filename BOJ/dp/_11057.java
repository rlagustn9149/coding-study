package BOJ.dp;
import java.util.*;

public class _11057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[][] dp = new int[10][n];

        for(int i=0; i<10; i++){
          dp[i][0]=1;  
        }

       
        for(int j=1; j<n; j++){
            for(int i=0; i<10; i++){
                for(int k=0; k<=i; k++){
                    dp[i][j] = (dp[i][j]+ dp[k][j-1])%10007;
                }
            }
        }

        int answer=0;

        for(int i=0; i<10; i++){
            answer = (answer + dp[i][n-1])%10007;
        }
        System.out.println(answer);
    }
}
