package BOJ.Graph;
import java.util.*;
import java.io.*;
public class _11724 {

    static int[][] arr;
    static boolean[] visit;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        visit=new boolean[n+1];

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b]=1;
            arr[b][a]=1;
        }

        int count=0;
        for(int i=1; i<=n; i++){
            if(!visit[i]){
                dfs(i);
                count++;
            }
        }
        System.out.print(count);
    }
    public static void dfs(int index){

        visit[index]=true;

        for(int i=1; i<=n; i++){
            if(arr[index][i]==1 && !visit[i]){
                dfs(i);
            }
        }
    }    
}
