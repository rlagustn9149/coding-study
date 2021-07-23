package Que;
import java.io.*;
import java.util.*;
public class _11866 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int front=1,back=1,select=n;
        int[] q= new int[n*n+1];
        int[] out= new int[n];

        for(int i=1; i<=n; i++) {q[i]=i; back++;}

        while(select>0){
            for(int i=0; i<k-1; i++){
                q[back]=q[front];
                back++;
                front++;
            }
            out[n-select]=q[front++];
            select--;
        }
        
        for(int i=0; i<n; i++){
            if(i==0){ 
                if(i==n-1) bw.write("<"+out[i]+">");
                else bw.write("<"+out[i]+", ");
            }
            else if(i==n-1) bw.write(out[i]+">");
            else bw.write(out[i]+", ");
        }
        bw.flush();
    }

}
