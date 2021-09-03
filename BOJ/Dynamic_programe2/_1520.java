package BOJ.Dynamic_programe2;
import java.util.*;
import java.io.*;

public class _1520 {

    static int[][] arr;
    static int[][] dp;  
    static int n,m;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,1,-1};

    public static int dfs(int x, int y){        
        if(x==n-1 && y==m-1) {
            return 1;
        }

        if(dp[x][y]!=-1) return dp[x][y];
      
        dp[x][y]=0;
        for(int i=0; i<4; i++){
            int tmpx=x+dx[i];
            int tmpy=y+dy[i];


            if(tmpx<0 || tmpx >= n || tmpy<0 || tmpy>=m) continue;

            if(arr[x][y]>arr[tmpx][tmpy]) dp[x][y] += dfs(tmpx,tmpy);
        }

        return dp[x][y];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        arr=new int[n][m];
        dp = new int[n][m];
        
        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine()," ");
            for(int j=0; j<m; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                dp[i][j]=-1;
            }
        }
    
        int answer=dfs(0,0);       
        System.out.println(answer);
    }    
}
