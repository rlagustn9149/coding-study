package bfs_dfs;
import java.util.*;
import java.io.*;
public class _1012 {
    
    static int[][] arr;
    static int answer;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static int M;
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            M=Integer.parseInt(st.nextToken());
            N=Integer.parseInt(st.nextToken());
            int K=Integer.parseInt(st.nextToken());
            arr=new int[M][N];
            answer=0;

            for(int j=0; j<K; j++){
                st = new StringTokenizer(br.readLine()," ");
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                arr[x][y]=1;
            }

            for(int m=0; m<M; m++){
                for(int n=0; n<N; n++){
                    if(arr[m][n]==1){
                        dfs(m,n);
                        answer++;
                    }
                }
            }
            sb.append(answer+"\n");
        }

        System.out.println(sb.toString());
    }

    public static void dfs(int x, int y){
        if(arr[x][y]==1) arr[x][y]=0;

        for(int i=0; i<4; i++){
            int X=x+dx[i];
            int Y=y+dy[i];
            if(X>=0 && Y>=0 && X<M && Y<N){
                if(arr[X][Y]==1) dfs(X,Y);
            }
        }
    }
}
