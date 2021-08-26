//바이러스
package BOJ.bfs_dfs;
import java.util.*;
import java.io.*;

public class _2606 {
    static boolean[] visit;
    static int[][] network;
    static int n;
    static int answer=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n= Integer.parseInt(br.readLine());
        visit = new boolean[n];
        network = new int[n][n];

        int links = Integer.parseInt(br.readLine());
        for(int i=0; i<links; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            network[a-1][b-1]=1;
            network[b-1][a-1]=1;
        }
        dfs(0);

        System.out.print(answer-1); // 자기 자신 (1번 네트워크는 제거해야 하므로 -1)
    }

    public static void dfs(int start){

        visit[start] = true;
        answer++;

        for(int i=0; i<n; i++){
            if(!visit[i] && network[start][i]==1){          
                dfs(i);
            }
        }

        return;
    }
}
