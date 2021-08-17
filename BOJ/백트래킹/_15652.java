package 백트래킹;

import java.io.*;
import java.util.*;

public class _15652 {

    public static BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[m];
        find(n,m,0,0);
        bw.flush();
    }   

    public static void find(int n, int m, int dept, int ex) throws IOException{
        if(m==dept){
            for(int i=0; i<m; i++ ){
                bw.write(arr[i]+" ");                
            }
            bw.write("\n");
            return;
        }
        for(int i=0; i<n; i++){
            if(i>=ex){
                arr[dept]=i+1;
                find(n,m,dept+1,i);
            }
        }
    }
}
