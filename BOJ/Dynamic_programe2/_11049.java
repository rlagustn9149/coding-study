package BOJ.Dynamic_programe2;
import java.util.*;
import java.io.*;
public class _11049 {
    
    static long[][] dp;
    static int[] row;
    static int[] col;
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        row=new int[n+1];
        col=new int[n+1];
        dp = new long[n+1][n+1];
        
        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            row[i]=Integer.parseInt(st.nextToken());
            col[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<=n-1; i++){
            dp[i][i+1]=row[i]*col[i]*col[i+1];     
        }

        for(int i=2; i<=n; i++){
            for(int j=i-1; j>0; j--){
                dp[j][i]=Integer.MAX_VALUE;
                for(int k=j; k<i; k++){
                    dp[j][i]=Math.min(dp[j][i],dp[j][k]+dp[k+1][i]+sum(j,k,i));
                }

            }
        }

        System.out.println(dp[1][n]);
    }

    public static int sum(int i, int k, int j){
        return row[i]*col[k]*col[j];
    }
  
}
