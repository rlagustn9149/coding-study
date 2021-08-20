package 그리디;


import java.io.*;
import java.util.*;
public class _11047 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int total=0;
        int[] coin = new int[n];
        for(int i=0; i<n; i++){
            coin[i]=Integer.parseInt(br.readLine());
        }
        for(int i=n-1; i>=0; i--){
            if(k>=coin[i]){
                total+=k/coin[i];
                k=k%coin[i];
            }
        }
        System.out.println(total);
    }   
}
