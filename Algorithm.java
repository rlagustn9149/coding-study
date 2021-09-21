
import java.util.*;
// 다익스트라, 벨만-포드, 플루이드, 
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

        for(int i=1; i<=n; i++){
            boolean update=false; // update 됐는지를 파악, 음수싸이클을 걸러낼수 있다.
            for(int j=1; j<=n; j++){
                if(answer[j]>answer[i]+arr[i][j]){
                    answer[j]=answer[i]+arr[i][j];
                    update=true;
                }
            }
            //if(!update)
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
}
