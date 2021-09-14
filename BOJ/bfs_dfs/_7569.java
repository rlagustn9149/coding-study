package bfs_dfs;
import java.util.*;
import java.io.*;
public class _7569 {
    
    static int[][][] arr;
    static int[] dx={1,-1,0,0,0,0};
    static int[] dy={0,0,1,-1,0,0};
    static int[] dz={0,0,0,0,1,-1};
    static int M,N,H;

    public static class node{
        int x;
        int y;
        int z;
        int date;
        public node(int x, int y, int z, int date){
            this.x=x;
            this.y=y;
            this.z=z;
            this.date=date;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        H=Integer.parseInt(st.nextToken());

        arr=new int[H][N][M];
        Queue<node> q = new LinkedList<>();
        int answer=0;

        for(int i=0; i<H; i++){
            for(int n=0; n<N; n++){
                st =new StringTokenizer(br.readLine()," ");
                for(int m=0; m<M; m++){
                    arr[i][n][m]=Integer.parseInt(st.nextToken());
                    if(arr[i][n][m]==1) q.add(new node(m,n,i,0));
                }
            }
        }

        while(!q.isEmpty()){
            node tmp = q.poll();
            int tx=tmp.x;
            int ty=tmp.y;
            int tz=tmp.z;
            int td=tmp.date;
            answer = Math.max(answer,td);
            for(int i=0; i<6; i++){
                int X=tx+dx[i];
                int Y=ty+dy[i];
                int Z=tz+dz[i];

                if(X>=0 && Y >= 0 && Z >= 0  && X<M && Y<N && Z<H){
                    if(arr[Z][Y][X]==0){
                        arr[Z][Y][X]=1;
                        q.add(new node(X,Y,Z,td+1));
                    }
                }
            }
        }

        for(int i=0; i<H; i++){
            for(int n=0; n<N; n++){
                for(int m=0; m<M; m++){
                    if(arr[i][n][m]==0){
                        System.out.println("-1");
                        return;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
