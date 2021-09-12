package bfs_dfs;
import java.util.*;
import java.io.*;
public class _7562 {
    
    static int[][] chess;
    static int[] dx={-2,-2,-1,-1,1,1,2,2};
    static int[] dy={1,-1,2,-2,2,-2,1,-1};
    static class move{
        int x;
        int y;
        int count;
        public move(int x, int y,int count){
            this.x=x;
            this.y=y;
            this.count=count;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int I = Integer.parseInt(br.readLine());
            chess= new int[I][I];

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x= Integer.parseInt(st.nextToken());
            int y= Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine()," ");
            int Tx= Integer.parseInt(st.nextToken());
            int Ty= Integer.parseInt(st.nextToken());
            

            sb.append(bfs(x,y,Tx,Ty)+"\n");
        }
        System.out.println(sb.toString());
    }
    public static int bfs(int x, int y , int tx, int ty){
        Queue<move> q = new LinkedList<>();
        q.add(new move(x,y,0));

        while(!q.isEmpty()){
            move tmp = q.poll();   
            if(tmp.x==tx && tmp.y==ty) {
                return tmp.count;
            }

            for(int i=0; i<8; i++){
                int X= tmp.x+dx[i];
                int Y= tmp.y+dy[i];
                
                if(X>=0 && Y>=0 && X<chess.length && Y<chess.length){
                    if(chess[X][Y]==0){
                        chess[X][Y]=1;
                        q.add(new move(X,Y,tmp.count+1));
                    }
                }
            }            
        }
    
        return -1;
    }
}
