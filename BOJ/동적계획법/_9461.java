package 동적계획법;

import java.io.*;

public class _9461 {
  
    public static long arr[]=new long[101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=2;
        arr[5]=2;

        for(int i=0; i<n; i++){
            int k=Integer.parseInt(br.readLine());
            bw.write(find(k)+"\n");
        }
        bw.flush();
    }
    public static long find(int n){
        if(arr[n]!=0) return arr[n];
        return arr[n]=find(n-1)+find(n-5);
    }
}
