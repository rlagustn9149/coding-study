package 정수론;

import java.io.*;
import java.util.*;

public class _2609 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[2];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        arr[0]=Integer.parseInt(st.nextToken());
        arr[1]=Integer.parseInt(st.nextToken());
        int a=1,b=1;

        if(arr[0]>=arr[1]){    
            for(int i=2; i<=arr[1]; i++){
                if(arr[0]%i==0 && arr[1]%i==0) a=i;
            }
            for(int i=arr[0]; i<=arr[0]*arr[1]; i++){
                if(i%arr[0]==0 && i%arr[1]==0) {b=i; break;}
            }
        }else{
            for(int i=2; i<=arr[0]; i++){
                if(arr[0]%i==0 && arr[1]%i==0) a=i;
            }
            for(int i=arr[1]; i<=arr[0]*arr[1]; i++){
                if(i%arr[0]==0 && i%arr[1]==0) {b=i; break;}
            }
        }
        System.out.println(a+"\n"+b);
    }
}
