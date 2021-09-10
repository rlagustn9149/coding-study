package BOJ.Dynamic_programe2;
import java.util.*;
import java.io.*;
public class _10942 {

    static int[] arr;
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr= new int[N+1];
        dp= new int[N+1][N+1];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++)
                dp[i][j]=-1;
        }
        
        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i][i]=1;
        }

        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            StringTokenizer st1=new StringTokenizer(br.readLine()," ");
            int a=Integer.parseInt(st1.nextToken());
            int b=Integer.parseInt(st1.nextToken());
            sb.append(search(a,b)+"\n");            
        }
        System.out.print(sb.toString());
    }
    public static int search(int x, int y){

        if(dp[x][y]!= -1) return dp[x][y];

        if(x+1==y){
            if(arr[x]==arr[y]) { dp[x][y]=1; return dp[x][y]; }
            
            dp[x][y]=0; 
            return dp[x][y];
        }

        int check = search(x+1,y-1);

        if(check==0) { dp[x][y]=0; return dp[x][y];}
        else{
            if(arr[x]==arr[y]){ dp[x][y]=1; return dp[x][y];}
            
            dp[x][y]=0;
            return dp[x][y];
        }     
    }
}
