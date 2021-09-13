package bfs_dfs;
import java.util.*;
public class _2667 {
    
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    static boolean[][] visit;
    static int[][] arr;
    static int answer=1;
    static int count;
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int N = sc.nextInt();
        arr= new int[N][N];
        visit = new boolean[N][N];

        for(int i=0; i<N; i++){
            String[] str = sc.next().split("");

            for(int j=0; j<N; j++){
                arr[i][j]=Integer.parseInt(str[j]);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visit[i][j] && arr[i][j]==1){
                    count=0;
                    dfs(i,j);
                    map.put(answer,count);
                    answer++;
                }
            }
        }

        sb.append(map.size()+"\n");
        int[] ans= new int[map.size()];

        for(int i=0; i<map.size(); i++){
            ans[i]=map.get(i+1);
        }
        Arrays.sort(ans);

        for(int i=0; i<map.size(); i++){
            sb.append(ans[i]+"\n");
        }

        System.out.print(sb.toString());
    }

    public static void dfs(int x, int y){
        visit[x][y]=true;
        arr[x][y]=answer;
        count++;

        for(int i=0; i<4; i++){
            int X= x+dx[i];
            int Y= y+dy[i];
            if(X>=0 && Y>=0 && X<arr.length && Y<arr.length){
                if(!visit[X][Y] && arr[X][Y]==1){
                    dfs(X,Y);
                }
            }

        }
    }

}
