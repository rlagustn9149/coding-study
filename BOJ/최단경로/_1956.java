package 최단경로;
import java.util.*;
import java.io.*;
public class _1956 {
    
    static int V,E;
    static int[][] cost;
    static int[][] minCost;
    static int max= 4000001;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] tmp = br.readLine().split(" ");
        V=Integer.parseInt(tmp[0]);
        E=Integer.parseInt(tmp[1]);

        cost=new int[V+1][V+1];
        for(int i=0; i<=V; i++){
            for(int j=0; j<=V; j++){
                cost[i][j]=max;
            }
        }
        minCost= new int[V+1][V+1];

        for(int i=0; i<E; i++){
            String[] t = br.readLine().split(" ");
            int a = Integer.parseInt(t[0]);
            int b = Integer.parseInt(t[1]);
            int c = Integer.parseInt(t[2]);
            cost[a][b]=c;
        }

        for(int i=1; i<=V; i++){
            find(i);
        }
        int min = max;
        for(int i=1; i<=V; i++){
            for(int j=1; j<=V; j++){
                if(i==j) continue;
                if(minCost[i][j] == max || minCost[j][i]== max) continue;
                min = Math.min(min, minCost[i][j]+ minCost[j][i]);        
            }
        }

        if(min == max) min=-1;
        System.out.print(min);

    }

    public static void find(int index){
        for(int i=1; i<=V; i++){
            minCost[index][i]=max;
        }
        minCost[index][index]=0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(index);
        
        while(!pq.isEmpty()){
            int tmp = pq.poll();
            for(int i=1; i<=V; i++){
                if(i==tmp) continue;
                if(minCost[index][i] > minCost[index][tmp] + cost[tmp][i]){
                    minCost[index][i] = minCost[index][tmp] + cost[tmp][i];
                    pq.add(i);
                }
            }
        }
    }
}
