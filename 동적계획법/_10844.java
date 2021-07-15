package 동적계획법;

import java.io.*;

public class _10844 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        long[][] arr = new long[10][n];
        long mod= 1000000000;

        arr[0][0]=0;
        for(int i=1; i<10; i++){
            arr[i][0]=1;
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<10; j++){
                if(j==0) arr[j][i]=arr[1][i-1]%mod;
                else if(j==9) arr[j][i]=arr[8][i-1]%mod;
                else{
                    arr[j][i]=arr[j-1][i-1]+arr[j+1][i-1]%mod;
                }
            }
        }
        long sum=0;
        
        for(int i=0; i<10; i++){
            sum+=arr[i][n-1];
        }
        System.out.println(sum);
    }
}
