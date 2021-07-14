package 동적계획법;

import java.io.*;

public class _2579 {
    
    public static long[] arr;
    public static long[] max_sum;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        arr= new long[n+1];
        max_sum=new long[n+1];
        max_sum[0]=0;
        max_sum[1]=arr[1];
        if(n>=2)
            max_sum[2]=arr[1]+arr[2];

        for(int i=1; i<=n; i++){
            arr[i]=Integer.parseInt(br.readLine()); 
        }
        System.out.println(find(n));
    }

    public static long find(int n){
        
        if(n<=0) return 0;
        if(max_sum[n]!=0) return max_sum[n];
         
        return max_sum[n]=Math.max(arr[n-1]+find(n-3),find(n-2))+arr[n];
    }
}
