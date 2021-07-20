package 정수론;

import java.util.*;
import java.io.*;

public class _1934 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        
        int[][] arr=new int[n][2];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            
            int a,b,r;
            if(arr[i][0]>arr[i][1]){
                a=arr[i][0];
                b=arr[i][1];
            }else{
                a=arr[i][1];
                b=arr[i][0];
            }
            while(a%b!=0){
                r=a%b;
                a=b;
                b=r;
            }
            int out=arr[i][0]*arr[i][1]/b;
            bw.write(out+"\n");
        }
        bw.flush();
    }
}
