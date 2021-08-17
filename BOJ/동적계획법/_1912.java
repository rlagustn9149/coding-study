package 동적계획법;

import java.io.*;
import java.util.*;

public class _1912 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input=new int[n];
        int arr[]=new int[n]; 
        int max;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        arr[0]=input[0];
        max=input[0];

        for(int i=1; i<n; i++){
            arr[i]=Math.max(arr[i-1]+input[i],input[i]);
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
        
    }
}
