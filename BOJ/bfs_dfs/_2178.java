package bfs_dfs;
import java.util.*;
public class _2178 {
    
    static int[][] arr;
    static boolean[][] visit;
    static int N;
    static int M;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};

    public static class node{
        int x;
        int y;
        int count;
        public node(int x, int y, int count){
            this.x=x;
            this.y=y;
            this.count=count;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] tmp =sc.nextLine().split(" ");
        N = Integer.parseInt(tmp[0]);
        M = Integer.parseInt(tmp[1]);

        

        arr=new int[N+1][M+1];
        visit=new boolean[N+1][M+1];

        for(int i=1; i<=N; i++){
            String[] tp = sc.nextLine().split("");
            for(int j=1; j<=M; j++){
                arr[i][j]=Integer.parseInt(tp[j-1]);
            }
        }
      
        visit[1][1]=true;
        int answer= bfs(1,1,1);
        System.out.print(answer);
    }

    public static int bfs(int x, int y, int count){
        
        Queue<node> q = new LinkedList<>();
        q.add(new node(x,y,count));

        while(!q.isEmpty()){
            node tmp = q.poll();

            if(tmp.x==N && tmp.y==M){
                return tmp.count;
            }

            for(int i=0; i<4; i++){
                int X=tmp.x+dx[i];
                int Y=tmp.y+dy[i];
                if(X>0 && Y>0 && X<N+1 && Y<M+1){
                    if(!visit[X][Y] && arr[X][Y]==1){
                        visit[X][Y]=true;
                        q.add(new node(X,Y,tmp.count+1));
                    }
                }
            }
        }
        return 0;
    }
}
