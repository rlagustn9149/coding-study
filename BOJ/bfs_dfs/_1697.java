package bfs_dfs;
import java.util.*;

public class _1697 {

    static class node{
        int x;
        int time;
        boolean[] visit;
        public node(int x, int time, boolean[] visit){
            this.x=x;
            this.time=time;
            this.visit=visit;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int answer = bfs(N,K);
        System.out.println(answer);
    }
    
    public static int bfs(int start, int target){
        Queue<node> q = new LinkedList<>();
        boolean[] visit= new boolean[100001];
        visit[start]=true;
        q.add(new node(start,0,visit));

        while(!q.isEmpty()){
            node tmp = q.poll();
            int x=tmp.x;
            int time=tmp.time;
            if(x==target){
                return time;
            }
            if( x+1<=100000 &&!tmp.visit[x+1]){
                tmp.visit[x+1]=true;
                q.add(new node(x+1,time+1,tmp.visit));
            }
            if(0<=(x-1) && !tmp.visit[x-1]){
                tmp.visit[x-1]=true;
                q.add(new node(x-1,time+1,tmp.visit));
            }
            if(x*2<=100000 &&!tmp.visit[x*2]){
                tmp.visit[x*2]=true;
                q.add(new node(x*2,tmp.time+1,tmp.visit));
            }           
        }

        return 0;
    }
}
