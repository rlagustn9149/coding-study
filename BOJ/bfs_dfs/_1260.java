package bfs_dfs;
import java.util.*;
import java.io.*;
public class _1260 {
    
    static boolean[] visit;
    static boolean[] visit1;
    static int[][] arr;
    static String answer="";
    static String answer1="";
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        visit = new boolean[N+1];
        visit1 = new boolean[N+1];
        arr= new int[N+1][N+1];
        
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y]=1;
            arr[y][x]=1;
        }
        visit[start]=true;
        answer=answer+start+" "; 
        DFS(start,0, N);

        BFS(start,N);
        
        System.out.println(answer);
        System.out.println(answer1);         
    }

    public static void DFS(int start, int count, int end){
        if(count == end){
            return;
        }
  
        for(int i=1; i<=end; i++){
            if(!visit[i] && arr[start][i]==1){
                visit[i]=true;
                answer=answer+i+" ";
               
                DFS(i,count++,end);     
            }
        }
    }

    public static void BFS(int start,int n){
        Queue<Integer> que =new LinkedList<>();
        que.add(start);
        visit1[start]=true;

        while(!que.isEmpty()){
            int idx= que.poll();
            answer1 =answer1+idx+" ";
            for(int i=1; i<=n; i++){
                if(!visit1[i]&& arr[idx][i]==1){
                    visit1[i]=true;
                    que.add(i);
                }
            }
        }
    }
}
