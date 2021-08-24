package programmers.bfs_dfs;

public class 네트워크 {
    class Solution {
        int[][] Computers;
        boolean[] visit;
        int answer =0;
        int N;
              
        void dfs(int start){
            
            visit[start]=true;
            for(int i=0; i<N; i++){
                if(i==start) continue;
                if(!visit[i] && Computers[start][i]==1) dfs(i);
            }
            return;
        }
        
        public int solution(int n, int[][] computers) {
            
            Computers = computers;
            visit = new boolean[n];
            N=n;
            for(int i=0; i<n; i++){
               if(!visit[i]) {dfs(i); answer++; }
            }
            
            return answer;
        }
    }
}
