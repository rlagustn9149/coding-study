package Divide_Conquer;
import java.io.*;
import java.util.*;
public class _1780 {
    static int[][] arr;
    static int minus=0;
    static int zero=0;
    static int one=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        arr=new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<n; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        
        divide(0,0,n);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }
    public static void divide(int row, int col, int size){
        if(colorCheck(row,col,size)){
            if(arr[row][col]==1) one++;
            else if(arr[row][col]==0) zero++;
            else minus++;
            return;
        }
        size = size/3;
        divide(row,col,size);
        divide(row,col+size,size);
        divide(row,col+size+size,size);
        divide(row+size,col,size);
        divide(row+size,col+size,size);
        divide(row+size,col+size+size,size);
        divide(row+size+size,col,size);
        divide(row+size+size,col+size,size);
        divide(row+size+size,col+size+size,size);
        

    }
    public static boolean colorCheck(int row, int col, int size){
        int check=arr[row][col];
        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
               if(check!=arr[i][j]) return false; 
            }
        }
        return true;
    }
}
