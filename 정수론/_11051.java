package 정수론;

import java.io.*;
import java.util.*;

public class _11051 {
   public static void main(String[] arg) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine()," ");

       int a=Integer.parseInt(st.nextToken());
       int b=Integer.parseInt(st.nextToken());
       int mod = 10007;
       int[][] arr= new int[a+1][a+1];
       
       for(int i=0; i<=a; i++){
           for(int j=0; j<=i; j++){
               if(arr[i][j]==0){
                   if(j==0) arr[i][j]=1;
                   else if(i==j) arr[i][j]=1;
                   else{
                    arr[i][j]=(arr[i-1][j-1]+arr[i-1][j])%mod;
                   } 
                   if(i==a && j==b)
                   {
                    System.out.println(arr[a][b]);
                    break;
                   }
               }
           }
       }
       
   } 
}
