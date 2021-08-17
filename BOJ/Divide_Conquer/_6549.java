package Divide_Conquer;
import java.io.*;
import java.util.*;
public class _6549 {
    
    static long[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        if(n==0) return;
        arr=new long[n];
        for(int i=0; i<n; i++){
           arr[i]=Integer.parseInt(st.nextToken());
        }
            
        }
        
    }
}
