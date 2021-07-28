package Divide_Conquer;
import java.io.*;
import java.util.*;
public class _2630 {
    static int[][] arr;
    static int blue=0;
    static int white=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        arr= new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            for(int j=0; j<n; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        divide(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void divide(int row, int col, int size){
        if(colorCheck(row,col,size)){
            if(arr[row][col]==0){
                white++;
            }else blue++;
            
            return;
        }

        size= size/2;
        
        divide(row,col,size);
        divide(row+size,col,size);
        divide(row,col+size,size);
        divide(row+size,col+size,size);
    } 
    public static boolean colorCheck(int row, int col, int size){
        int check= arr[row][col];
        for(int i=row; i<row+size; i++){
            for(int j=col; j<col+size; j++){
                if(arr[i][j]!=check) return false;
            }
        }

        return true;
    }
}
