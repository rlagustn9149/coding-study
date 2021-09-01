package programmers.graph;
import java.util.*;
public class 가장먼노드 {
class Solution {

    int[] dist;
    boolean[][] edges;
    boolean[] visit;
    int N;
    
    class node{
        int V;
        int E;
        public node(int V, int E){
            this.V=V;
            this.E=E;
        }
    }
    
    public void bfs(){
        Queue<node> q = new LinkedList<>();
        visit[1]=true;
        q.add(new node(1,0));
       
        while(q.size()!=0){
            node v= q.poll();
            dist[v.V]=v.E;
            
            for(int i=2; i<=N; i++){
                if(!visit[i] && edges[v.V][i]){
                    q.add(new node(i,v.E+1));
                    visit[i] =true;
                }
            }
          
        }
    }
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        dist = new int[n+1];
        edges= new boolean[n+1][n+1];
        N=n;
        visit= new boolean[N+1];
        for(int i=0; i< edge.length; i++){
            edges[edge[i][0]][edge[i][1]]=true;
            edges[edge[i][1]][edge[i][0]]=true;
        }
        
        bfs();
        
        int max= Integer.MIN_VALUE;
        for(int i=2; i<=n; i++){
            max=Math.max(max,dist[i]);
        }
    
        for(int i=2; i<=n; i++){
            if(max==dist[i]) answer++;        
        }
        return answer;
    }
}
}
