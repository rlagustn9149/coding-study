package 동적계획법;

import java.io.*;
import java.util.*;

public class _9184 {

    public static int[][][] arr=new int[21][21][21];
    
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a,b,c;
        while(true){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            c=Integer.parseInt(st.nextToken());
            if(a==-1 && b==-1 && c==-1) break;
            bw.write("w("+a+", "+b+", "+c+") = "+w(a,b,c)+"\n");
            bw.flush();
        }
        
    }
    public static int w(int a, int b, int c){
        
         
        if(a<=0 || b<= 0 || c<= 0) return 1;
        if(a>20 || b > 20 || c>20) return arr[20][20][20]=w(20,20,20);
        
        if(arr[a][b][c]!=0)
            return arr[a][b][c];
        
        if(a<b && b<c){
            return arr[a][b][c]=w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c);
        }
        return arr[a][b][c]=w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1);
    }
}
