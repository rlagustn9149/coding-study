package 동적계획법;

import java.io.*;
import java.util.*;

public class _12865 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");

        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] w= new int[n+1];
        int[] v= new int[n+1];
        int[][] arr= new int[n+1][k+1];

        for(int i=1; i<=n; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            w[i]=Integer.parseInt(st1.nextToken());
            v[i]=Integer.parseInt(st1.nextToken());
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=k; j++){
                if(w[i]>j) arr[i][j]=arr[i-1][j];
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i-1][j-w[i]]+v[i]);
                }
            }
        }
        System.out.println(arr[n][k]);
    }    
}
