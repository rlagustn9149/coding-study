package 정수론;
import java.io.*;
import java.util.*;
public class _1010 {
    
    static int[][] arr=new int[30][30];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t_case= Integer.parseInt(br.readLine());
        int n,m;
        
        for(int i=0; i<t_case; i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());
            int com=Combination(m,n);
            bw.write(com+"\n");
        } 
        bw.flush();
    }
    
    private static int Combination(int n, int m) {
        if(arr[n][m]!=0) return arr[n][m];
        if(n==m || m==0) return arr[n][m]=1;
        
        return arr[n][m]=Combination(n-1,m-1)+Combination(n-1,m);
    }

}
