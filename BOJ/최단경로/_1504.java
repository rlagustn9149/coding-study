package 최단경로;
import java.util.*;
import java.io.*;
public class _1504 {
    
    static int N,E;
    static int[][] cost;
    static int[][] minCost;
    static int max= 160000001;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp= br.readLine().split(" ");
        N=Integer.parseInt(tmp[0]);
        E=Integer.parseInt(tmp[1]);
        
        cost= new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                cost[i][j]=max;
            }
        }
        
        for(int i=0; i<E; i++){
            String[] T = br.readLine().split(" ");
            int a  = Integer.parseInt(T[0]);
            int b  = Integer.parseInt(T[1]);
            int c  = Integer.parseInt(T[2]);
            cost[a][b]=c;
            cost[b][a]=c;
        }
        
        String[] t = br.readLine().split(" ");
        int v1 = Integer.parseInt(t[0]);
        int v2 = Integer.parseInt(t[1]);

        minCost=new int[3][N+1];

        find(1,0);
        find(v1,1);
        find(v2,2);

        int answer = max;
        answer = Math.min(answer, minCost[0][v1] + minCost[1][v2]+ minCost[2][N]);
        answer = Math.min(answer, minCost[0][v2] + minCost[2][v1]+ minCost[1][N]);
        //answer = Math.max(answer, minCost[0][v1] + minCost[1][v2]+ minCost[2][v1]+minCost[1][N]);
        //answer = Math.max(answer, minCost[0][v2] + minCost[2][v1]+ minCost[1][v2]+minCost[2][N]);

        if(answer>=max) answer=-1;
        System.out.print(answer);
    }
    public static void find(int index, int num){
        for(int i=1; i<=N; i++){
            minCost[num][i]=max;
        }
        minCost[num][index]=0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(index);

        while(!pq.isEmpty()){
            int tmp = pq.poll();
            for(int i=1; i<=N; i++){
                if(minCost[num][i] > minCost[num][tmp] + cost[tmp][i]){
                    minCost[num][i] = minCost[num][tmp] + cost[tmp][i];
                    pq.offer(i);
                }
            }
        }
    }
}
