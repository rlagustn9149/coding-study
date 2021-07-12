package 백트래킹;

import java.io.*;
import java.util.*;

public class _14889 {
    
    public static int[][] arr;
    public static boolean[] choose;
    public static int min=200000;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr= new int[n][n];
        choose = new boolean[n];

        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            for(int j=0; j<n; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        match(n,0,0);
        System.out.println(min);
    }   

    public static void match(int n,int index,int m){
        if(m==n/2){
            int start=0,link=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(choose[i]==true && choose[j]==true){
                        start = start+ arr[i][j];
                    }
                    if(choose[i]==false && choose[j]==false){
                        link=link+arr[i][j];
                    }
                }
            }
            if(Math.abs(start-link)<min){
                min= Math.abs(start-link);
            }
            return;
        }

        for(int i=index; i<n; i++){
            if(!choose[i]){
                choose[i]=true;
                match(n,i+1,m+1);
                choose[i]=false;
            }
        }

    }
    
}
