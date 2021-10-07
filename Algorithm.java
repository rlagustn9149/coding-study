
import java.util.*;

// 다익스트라, 벨만-포드, 플루이드 와샬, 크루스칼

// 다익스트라 : 최단경로 구하기
// 벨만-포드 : 최단경로 구하기인데 음의 값이 존재해 서클을 돌때마다 값이 계속 작아지는 루프에 빠질 수 있음
// 플루이드 와샬: 모든 점에서 모든 점까지의 최단경로 구하기
// 크루스칼: 모든 노드를 연결하는 최소값을 갖는 그래프 구하기 

public class Algorithm {

    int n;  // 정점의 수
    int[][] arr; // 간선에 대한 가중치를 저장해 놓은 배열 // 초기값: 다익스트라에서는 갈수 없는 곳은 -1, 벨만-포드는 MAX_VALUE
    int[] answer; // 최소 값을 저장해놓는 배열, 초기값: MAX_VALUE
    
    //Arrays.stream(food_times).sum()
    
    //다익스트라
    public void Distra(int start,int end){
        PriorityQueue<Integer> q = new PriorityQueue<>();    
        q.add(start);

        while(!q.isEmpty()){    
            int tmp = q.poll();
            for(int i=0; i<n; i++){                        
                if(arr[tmp][i]!=-1){
                    if(answer[i]>answer[tmp]+arr[tmp][i]){  // 기존에 시작점에서 i까지 가는 방식보다
                        answer[i]=answer[tmp]+arr[tmp][i];  // 시작점에서 tmp를 거쳐 i 까지 가는 비용이 더 적을 시에 
                        q.add(i);                           // 값을 다시 저장하고 que에 i를 넣음.
                    }
                }
            }
        }
    }

    //벨만-포드 
    public void bellman(int start, int end){

        boolean update=false;
        for(int k=1; k<=n; k++){
            update=false; // update 됐는지를 파악, 변화가 없으면 값이 다 변한 것이다.
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(arr[i][j]==Integer.MAX_VALUE) continue; 
                    if(answer[j]>answer[i]+arr[i][j]){
                        answer[j]=answer[i]+arr[i][j];
                        update=true;
                    }
                }
            }
            if(!update) break;
        }
        if(update){ // n-1 개의 간선을 다 돌았는데도 계속 update가 되었다면
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(arr[i][j]==Integer.MAX_VALUE) continue;
                    if(answer[j]>answer[i]+arr[i][j]){      // 간선을 다 돌았는데도 값이 변하면
                        answer[j]=answer[i]+arr[i][j];      // 음수 서클이 존재하다는 것
                        
                    }
                }
            }
        }

    }

    //플로이드 와샬

    public void floyd(){
        
        for(int i=0; i<n; i++){  // 자기 자신에서 가는 경우는 0으로 초기화
            arr[i][i]=0;
        }

        for(int k=0; k<n; k++ ){  // i -> j 로 가는 것과 i->k->j 를 가는 길을 비교해서 작은값
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j]=Math.min(arr[i][j], arr[i][k]+arr[k][i]);
                }
            }
        }
    }
    /// 크루스칼
    static class node implements Comparable<node>{
        int A;
        int B;
        int W;
        public node(int A, int B, int W){
          this.A=A;
          this.B=B;
          this.W=W;
        }
        public int compareTo(node o){
          return this.W - o.W;
        }
    }
    static int[] parent;
    public void kruskal(){

       parent=new int[n+1];
       for(int i=1; i<=n; i++) parent[i]=i; // 자신 부모 초기화

       PriorityQueue<node> q = new PriorityQueue<>();
       int sum=0;
       while(!q.isEmpty()){
           node n = q.poll();
           int parentA=find(n.A);      
           int parentB=find(n.B);
           if(parentA!=parentB){   // 루트가 다르면 연결 시켜줌 
             parent[parentA]=parentB;
             sum+=n.W;
           }
         } 
       
    }

    public static int find(int x){  // 부모를 찾아줌
        if(parent[x]==x) return x;
        else return parent[x] = find(parent[x]); // 자신과 연결된 root를 찾음
    }
}
