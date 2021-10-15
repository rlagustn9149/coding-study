package BOJ.최단경로;
import java.util.*;
import java.io.*;
public class _9370 {
    static int n,m,t,s,g,h;
    static int[][] cost;
    static int[] end;
    static int[][] board;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());
        
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");    
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            
            board= new int[n+1][n+1]; // 도로
            end= new int[t];    // 목적지

            st= new StringTokenizer(br.readLine()," ");
            s = Integer.parseInt(st.nextToken()); //시작점
            g = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            for(int j=0; j<m; j++){
                st= new StringTokenizer(br.readLine()," ");
                int x=Integer.parseInt(st.nextToken());
                int y=Integer.parseInt(st.nextToken());
                int leng=Integer.parseInt(st.nextToken());
                board[x][y]=leng;
                board[y][x]=leng;
            }
            for(int k=0; k<t; k++){
                end[k]=Integer.parseInt(br.readLine());
            }
            
            cost= new int[3][n+1];
            for(int j=0; j<3; j++){
                for(int k=0; k<=n; k++)
                    cost[j][k]= 2000000;
            }

            Dijst(board,0,s);
            Dijst(board,1,g);
            Dijst(board,2,h);          
            findend();
        }
        
        System.out.print(sb.toString());
    }

    public static void Dijst(int[][] board,int index, int start){
        cost[index][start]=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(start);
        while(!pq.isEmpty()){
            int tmp =pq.poll();
            for(int i=1; i<=n; i++){
                if(cost[index][i] > cost[index][tmp]+board[tmp][i]  && board[tmp][i]!=0){
                    cost[index][i]=cost[index][tmp]+board[tmp][i];
                    pq.add(i);
                }
            }
        }  
    }

    public static void findend(){
         
        int[] answer=new int[t];
        int j=0;
        // 0 : s,  1 : g, 2 : h
        for(int i=0; i<t; i++){
            if( cost[0][end[i]] == cost[0][g]+ board[g][h] + cost[2][end[i]] || cost[0][end[i]] == cost[0][h]+ board[h][g]+ cost[1][end[i]] ){
                answer[j++]=end[i];
            }
        }
      
        int[] tmp= new int[j];
        for(int i=0; i<j; i++){
            tmp[i]=answer[i];
        }
        Arrays.sort(tmp);
        for(int i=0; i<j; i++){
            sb.append(tmp[i]+" ");
        }
        sb.append("\n");
    }
}
