package 동적계획법;

import java.io.*;
import java.util.*;

public class _1932 {
    
    public static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        arr = new int[n][n];
        
        ;
        
        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            for(int j=0; j<=i; j++){
                if(i==0){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                }else{
                    if(j==0){
                        arr[i][j]=arr[i-1][j]+Integer.parseInt(st.nextToken());
                    }else if(j==n){
                        arr[i][j]=arr[i-1][j-1]+Integer.parseInt(st.nextToken());
                    }else{
                        arr[i][j]=Math.max(arr[i-1][j-1],arr[i-1][j])+Integer.parseInt(st.nextToken());
                    }
                }
            }
        }
        int max=0;
        for(int i=0; i<n; i++){
            max=Math.max(max,arr[n-1][i]);
        }
        System.out.println(max);

    }
}
