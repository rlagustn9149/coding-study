package 정수론;

import java.io.*;
import java.util.*;

public class _3036 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());

        for(int i=1; i<n; i++){
            int gcd= GCD(arr[0],arr[i]);
            bw.write(arr[0]/gcd+"/"+arr[i]/gcd+"\n");
        }
        bw.flush();
    }
    public static int GCD(int a,int b){
        while(a%b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return b;
    }
}
