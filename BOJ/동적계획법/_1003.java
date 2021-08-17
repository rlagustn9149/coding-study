package 동적계획법;

import java.io.*;

public class _1003 {
    
    public static Integer[][] fibo= new Integer[41][2];
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(bf.readLine());
        
        fibo[0][0]=1;
        fibo[0][1]=0;
        fibo[1][0]=0;
        fibo[1][1]=1;

        for(int i=0; i<n; i++){
            int k = Integer.parseInt(bf.readLine());
            fibo(k);
            bw.write(fibo[k][0]+" "+fibo[k][1]+"\n");
        }
        bw.flush();
    }
    public static Integer[] fibo(int n){
        if(fibo[n][0]==null && fibo[n][1]==null){
            fibo[n][0]= fibo(n-1)[0]+fibo(n-2)[0];
            fibo[n][1]= fibo(n-1)[1]+fibo(n-2)[1];
        }

        return fibo[n];
    }
}
