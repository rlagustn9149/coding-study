package 백트래킹;

import java.io.*;
import java.util.*;

public class _9663 {
    public static boolean[][] arr;
    public static int count;
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n=Integer.parseInt(st.nextToken());
        arr = new boolean[n][n];
        count=0;
        
        find(n,0);
        System.out.println(count);
        
    }
    public static boolean check(int col, int row, int n){
        boolean check =true;

        for(int i=0; i<n; i++){
            if(arr[i][row]==true) return false;
        }
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                if(i-j == col-row){
                    if(arr[i][j]==true) return false;
                }
            }
        }
       for(int i=0; i<n; i++){
            if(col-i>=0 && row+i <n){
               if(arr[col-i][row+i] == true) return false;
            }
       }

        return check;
    }

    public static void find(int n,int col){
        
        if(col==n){
            count++;
            return;
        }

        for(int i=0; i<n; i++){
            if(check(col,i, n)){
                arr[col][i]=true;
                find(n,col+1);
                arr[col][i]=false;
            }
        }
    }
}
