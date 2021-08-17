package 동적계획법;

import java.io.*;
import java.util.*;

public class _11054 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        int[] lts=new int[n];
        int[] b_lts=new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<n; i++){
            lts[i]=1;
            for(int j=0; j<i; j++){
                if(arr[i]>arr[j] && lts[i]<=lts[j]){
                    lts[i]=lts[j]+1;
                }
            }
        }

        for(int i=n-1; i>=0; i--){
            b_lts[i]=1;
            for(int j=n-1; j>i; j--){
                if(arr[i]>arr[j] && b_lts[i]<=b_lts[j]){
                    b_lts[i]=b_lts[j]+1;
                }
            }
        }

        int max=0;
        for(int i=0; i<n; i++){
            if(max<lts[i]+b_lts[i]) max=lts[i]+b_lts[i]-1;
        }
        System.out.println(max);

    }
}
