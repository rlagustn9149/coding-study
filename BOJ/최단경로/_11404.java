package 최단경로;
import java.util.*;
public class _11404 {
    
    static int[][] cost;
    static int n,m;
    static int[] minCost;
    static int max= 10000001;
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        m=Integer.parseInt(sc.nextLine());

        cost = new int[n+1][n+1];
        for(int i=1; i<n+1; i++){
            for(int j=1; j<n+1; j++){
                cost[i][j]=max;
            }
        }

        for(int i=0; i<m; i++){
            String[] tmp = sc.nextLine().split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            int c = Integer.parseInt(tmp[2]);
            cost[a][b]=Math.min(cost[a][b], c);
        }

        for(int i=1; i<n+1; i++){
            find(i);
        }


    } 
    public static void find(int index){
        minCost= new int[n+1];
        for(int i=1; i<=n ;i++){
            minCost[i]=max;
            if(i==index) minCost[i]=0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(index);

        while(!pq.isEmpty()){
            int tmp = pq.poll();
            for(int i=1; i<=n; i++){
                if(i==tmp) continue;
                if(minCost[i]> cost[tmp][i] + minCost[tmp]){
                    minCost[i]=cost[tmp][i] + minCost[tmp];
                    pq.offer(i);
                }                
            }
        }

        for(int i=1; i<=n; i++){
            if(minCost[i]==max) System.out.print(0+" ");
            else System.out.print(minCost[i]+" ");
        }
        System.out.println();
    }
}
