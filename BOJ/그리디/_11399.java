package 그리디;

import java.io.*;
import java.util.*;

public class _11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr= new int[n]; 
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
    
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int sum=0;
        int check=0;

        for(int i=0; i<n; i++){
            check+=arr[i];
            sum+=check;
        }
        System.out.println(sum);
    }
}
