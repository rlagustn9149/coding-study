package bfs_dfs;
import java.util.*;
import java.io.*;
public class _2206 {

    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,1,-1};
    static int[][] arr;
    static boolean[][][] visit;
    static int N,M;

    public static class node{
        int x;
        int y;
        int move;
        int breaked;
        public node(int x, int y,int move, int breaked){
            this.x=x;
            this.y=y;
            this.move=move;
            this.breaked=breaked;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());

        arr=new int[N+1][M+1];
        visit = new boolean[N+1][M+1][2];

        for(int i=1; i<=N; i++){
            String[] tmp = br.readLine().split("");
            
            for(int j=1; j<=M; j++){
                arr[i][j]=Integer.parseInt(tmp[j-1]);
            }
        }
        int answer = bfs(1,1,1,0);
        
        System.out.println(answer);
    }

    public static int bfs(int x,int y,int move, int breaked){
        Queue<node> q = new LinkedList<>();
        q.add(new node(x,y,move,breaked));
        
        while(!q.isEmpty()){
            node tmp = q.poll();
            int tx=tmp.x;
            int ty=tmp.y;
            int tmove=tmp.move;
            if(tx==N && ty==M) return tmove;

            for(int i=0; i<4; i++){
                int X=tx+dx[i];
                int Y=ty+dy[i];
                if(X>0 && X<=N && Y>0 && Y<=M){
                    
                    if(tmp.breaked==0){
                        if(!visit[X][Y][0]){
                            if(arr[X][Y]==0){
                                visit[X][Y][0]=true;
                                q.add(new node(X,Y,tmove+1,tmp.breaked));
                            }
                            else{
                                visit[X][Y][1]=true;
                                q.add(new node(X,Y,tmove+1,tmp.breaked+1)); 
                            }
                        }
                    }else{
                        if(!visit[X][Y][0] && !visit[X][Y][1]){
                            if(arr[X][Y]==0){
                                visit[X][Y][1]=true;
                                q.add(new node(X,Y,tmove+1,tmp.breaked));
                            }
                        }
                    }     
                }
            }

        }
        return -1;
    }
}
