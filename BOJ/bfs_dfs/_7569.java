package bfs_dfs;
import java.util.*;
import java.io.*;
public class _7569 {
    
    static boolean[][][] visit;
    static int[][][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        int H=Integer.parseInt(st.nextToken());

        arr=new int[H][N][M];
        visit = new boolean[H][N][M];

        for(int i=0; i<H; i++){
            for(int n=0; n<N; n++){
                st =new StringTokenizer(br.readLine()," ");
                for(int m=0; m<M; m++){
                    arr[i][n][m]=Integer.parseInt(st.nextToken());
                }
            }
        }

        for(int i=0; i<H; i++){
            for(int n=0; n<N; n++){
                for(int m=0; m<M; m++){
                    if(!visit[i][n][m] && arr[i][n][m]==0){
                        bfs(i,n,m);
                    }
                }
            }
        }

    }
}
