package BOJ.Dynamic_programe2;
import java.util.*;
import java.io.*;
public class _11066 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
    
        for(int i=0; i<testcase; i++){
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            int[] arr=new int[size+1];
            int[][] dp = new int[size+1][size+1];
            int[] sum=new int[size+1];

            for(int j=1; j<=size; j++){
                int tmp = Integer.parseInt(st.nextToken());
                arr[j]= tmp;
                       
                sum[j]=sum[j-1]+tmp;
                     
            }


            for(int j=1; j<=size; j++){
                for(int m=j-1; m>0; m--){
                    dp[m][j]=Integer.MAX_VALUE;
                    for(int k=m; k<j; k++){
                        dp[m][j]=Math.min(dp[m][j],dp[m][k]+dp[k+1][j]);
                    }
                    dp[m][j] +=(sum[j]-sum[m-1]);
                    //System.out.println(m+" "+j+" = "+dp[m][j]);
                }
            }

             

            sb.append(dp[1][size]+"\n");
        }
        System.out.print(sb.toString());
    }

    
}
