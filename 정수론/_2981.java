package 정수론;

import java.io.*;
import java.util.*;
public class _2981 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int gcd =arr[1]-arr[0];
        for(int i=2; i<n; i++){
            gcd = GCD(gcd,arr[i]-arr[i-1]);
        }

        for(int i=2; i<=gcd; i++){
            if(gcd%i==0) bw.write(i+" ");
        }
        bw.flush();
    }
    public static int GCD(int a, int b){
        int r;
        while(a%b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return b;
    }
}
