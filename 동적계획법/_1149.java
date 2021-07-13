package 동적계획법;

import java.io.*;
import java.util.*;

public class _1149 {
    
    public static int[] R=new int[1001];
    public static int[] G=new int[1001];
    public static int[] B=new int[1001];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int r= Integer.parseInt(st.nextToken());
            int g= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());

            if(i==1){
                R[1]=r;
                G[1]=g;
                B[1]=b;
            }else{
                R[i]=Math.min(G[i-1],B[i-1])+r;
                G[i]=Math.min(R[i-1],B[i-1])+g;
                B[i]=Math.min(R[i-1],G[i-1])+b;
            }
        }
        System.out.println(Math.min(Math.min(R[n],G[n]),B[n]));
    
    }
}
