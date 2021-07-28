package Divide_Conquer;
import java.io.*;
public class _1992 {
    static int[][] arr;
    static StringBuilder sb =new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        arr= new int[n][n];
        for(int i=0; i<n; i++){
            String str= br.readLine();
            for(int j=0; j<n; j++){
                arr[i][j]= Character.getNumericValue(str.charAt(j));
            }
        }
        divide(0,0,n);
        System.out.println(sb);
    }
    public static void divide(int row, int col, int size){
        if(colorCheck(row,col,size)){
            if(arr[row][col]==0){
                sb.append('0');
            }else 
                sb.append('1');
            return;
        }

        size= size/2;
        sb.append('(');
        divide(row,col,size);
        divide(row,col+size,size);
        divide(row+size,col,size);
        divide(row+size,col+size,size);
        sb.append(')');
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
