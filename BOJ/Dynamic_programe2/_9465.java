package BOJ.Dynamic_programe2;
import java.util.*;
import java.io.*;
public class _9465 {
    
    static int[][] stick;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            
            int n = Integer.parseInt(br.readLine());
            stick = new int[2][n];
            
            for(int k=0; k<2; k++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                for(int j=0; j<n; j++){
                    stick[k][j]=Integer.parseInt(st.nextToken());
                }
            }

            dp = new int[2][n];
            dp[0][0] = stick[0][0];
            dp[1][0] = stick[1][0];
            
            if(n>=2){    

                dp[0][1] = dp[1][0]+stick[0][1];
                dp[1][1] = dp[0][0]+stick[1][1];
                
                for(int j=2; j<n; j++){
                    dp[0][j]= Math.max(dp[1][j-1]+stick[0][j], dp[1][j-2]+stick[0][j]);
                    dp[1][j]= Math.max(dp[0][j-1]+stick[1][j], dp[0][j-2]+stick[1][j]);
                }
            }   
            
            System.out.println(Math.max(dp[0][n-1],dp[1][n-1]));
        }
    }
}
