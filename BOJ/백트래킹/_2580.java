package 백트래킹;

import java.io.*;
import java.util.*;

public class _2580 {

    public static int[][] arr = new int[9][9];
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<9; j++) arr[i][j]=Integer.parseInt(st.nextToken());
        }
        game(0,0);


    }
    public static void game(int row, int col) throws IOException{
        
        if(row == 9) {
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    bw.write(arr[i][j]+" ");
                }
                bw.write("\n");
            }
            bw.flush();
            System.exit(0);
        }

        if(col == 9 ){
            game(row+1,0);
            return;
        }
        
        if(arr[row][col]==0){
            for(int value =1; value<10; value++){
               if(check(row,col,value)){ 
                    arr[row][col]=value;
                    game(row,col+1);
               }
           }
           arr[row][col]=0;
           return;
        }
        game(row, col+1);
    }
    
    public static boolean check(int row, int col,int value){
        
        for(int i=0; i<9; i++){
            if(arr[row][i]==value) return false;
            if(arr[i][col]==value) return false;
        }
        
        int row1 = (row/3)*3;
        int col1 = (col/3)*3;
        
        for(int i= row1; i<row1+3; i++){
            for(int j=col1; j<col1+3; j++){
                if(arr[i][j]==value) return false;
            }
        }

        return true;
    }
}
