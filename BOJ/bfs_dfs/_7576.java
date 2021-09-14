package bfs_dfs;
import java.util.*;
import java.io.*;
public class _7576 {
 
    static int[][] arr;
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static int M,N;
    

    static class node{
        int x;
        int y;
        int count;
        public node(int x, int y ,int count){
            this.x=x;
            this.y=y;
            this.count=count;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());

        arr=new int[N][M];

        Queue<node> q = new LinkedList<>();

        for(int n=0; n<N; n++){
            st =new StringTokenizer(br.readLine()," ");
            for(int m=0; m<M; m++){
                arr[n][m]=Integer.parseInt(st.nextToken());
                if(arr[n][m]==1){
                    q.add(new node(m,n,0));
                }
            }
        }
        
        int answer=0;
        while(!q.isEmpty()){
            node tmp = q.poll();
            int x = tmp.x;
            int y = tmp.y;
            int count = tmp.count;
            answer= Math.max(answer,count);

            for(int i=0;i<4; i++){
                int X=x+dx[i];
                int Y=y+dy[i];

                if(X>=0 && Y>=0 && X<M && Y<N){
                    if(arr[Y][X]==0){
                        arr[Y][X]=1;
                        q.add(new node(X,Y,count+1));
                    }
                }
            }

        }
       
            
        for(int n=0; n<N; n++){
            for(int m=0; m<M; m++){
                if(arr[n][m]==0){
                    System.out.println("-1");
                    return;
                }
            }
        }
        
        
      
        System.out.println(answer);
    }
    
}
