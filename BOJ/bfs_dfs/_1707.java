package bfs_dfs;
import java.util.*;
import java.io.*;
public class _1707 {

    static HashSet<Integer> a;
    static HashSet<Integer> b;
    static int V;
    static int E;
    static boolean[] visit;
    static int[][] arr;
    static boolean check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int T= Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            a = new HashSet<>();  //
            b= new HashSet<>();   //  a,b 로 그룹을 나눔
            visit=new boolean[V+1];
            arr=new int[E][2];     // 연결된 V값을 저장             
            check=false;
            for(int j=0; j<E; j++){
                st = new StringTokenizer(br.readLine()," ");
                arr[j][0]=Integer.parseInt(st.nextToken());
                arr[j][1]=Integer.parseInt(st.nextToken());
            }
            dfs(0,E);
            if(check) sb.append("YES\n");
            else sb.append("NO\n");
    
        }
        System.out.print(sb.toString());
       
        
    }

    public static void dfs(int index, int last){
        if(index==last) { check= true; return;}

        int x = arr[index][0];
        int y = arr[index][1];

        // x와 y가 이미 set에 들어가 있는경우
        if(visit[x] && visit[y]){ 
            // x,y 가 같은 set(a,b) 에 들어가 있는 경우
            if(a.contains(x) && a.contains(y)) return;
            if(b.contains(x) && b.contains(y)) return;

            dfs(index+1,last);
        }
        //둘중 하나만 들어가있는경우
        else if(visit[x] || visit[y]){
            //x만 들어가 있는데
            if(visit[x]){
                // x가 set(a) 에 있으면 
                if(a.contains(x)){
                    b.add(y);  // set(b) 에 y을 넣어줌
                }else{
                    a.add(y);
                }
                visit[y]=true;
                dfs(index+1,last);         
            }
            else{
                // y만 들어가 있는데 y가 set(a) 에 있는 경우
                if(a.contains(y)){
                    b.add(x);
                }else{
                    a.add(x);
                }
                visit[x]=true;
                dfs(index+1,last);
            }
            
        }else{      //둘다 방문을 안한 경우

            visit[x]=true;
            visit[y]=true;
            a.add(x);
            b.add(y);
            dfs(index+1,last);

            a.remove(x);
            b.remove(y);
            a.add(y);
            b.add(x);
            dfs(index+1,last);
        }
    }
}
