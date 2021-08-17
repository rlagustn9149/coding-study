package 백트래킹;

import java.io.*;
import java.util.*;

public class _15649 {
    
    public static int[] arr;
    public static boolean[] visit;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args)throws IOException{
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n,m;
    StringTokenizer st= new StringTokenizer(bf.readLine()," ");
    
    n=Integer.parseInt(st.nextToken());
    m=Integer.parseInt(st.nextToken());
    
    visit=new boolean[n];
    arr= new int[m];
    find(n,m,0);
    bw.flush();

    }

    public static void find(int n, int m, int check) throws IOException{
        if(m==check){
            for(int i=0; i<m; i++)
                bw.write(arr[i]+" ");
            bw.write("\n");
            return;
        }
        for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i]=true;
                arr[check]=i+1;
                find(n,m,check+1);
                visit[i]=false;
            }
        }

    }
 
}
