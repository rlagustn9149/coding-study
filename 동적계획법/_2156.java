package 동적계획법;

import java.io.*;

public class _2156 {
    
    public static int[] arr;
    public static int[] max_sum;

    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        arr= new int[n+1];
        max_sum = new int[n+1];
        max_sum[0]=0;
        arr[0]=0;
        
        for(int i=1; i<=n; i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(i==1) max_sum[1]=arr[1];
            else if(i==2) max_sum[2]=arr[1]+arr[2];
            else{max_sum[i]=Math.max(Math.max(max_sum[i-2]+arr[i],max_sum[i-3]+arr[i-1]+arr[i]),max_sum[i-1]);}
        }

     
        System.out.println(max_sum[n]);

    }    
}
