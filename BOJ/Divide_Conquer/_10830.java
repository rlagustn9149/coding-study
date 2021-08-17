package Divide_Conquer;
import java.io.*;
import java.util.*;
public class _10830 {
    static int[][] A;
    static int mod=1000;
    static StringTokenizer st;
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine()," ");
        N=Integer.parseInt(st.nextToken());
        long B=Long.parseLong(st.nextToken());
        int[][] out = new int[N][N];
        StringBuilder sb= new StringBuilder();

        A=new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++){
                A[i][j]=Integer.parseInt(st.nextToken())%mod;
            }
        }
        out=exp(A,B);
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append(out[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static int[][] exp(int[][] a , long b)
    {
        if(b==1) return a;
       
        int[][] tmp = exp(a,b/2);

        tmp=multi(tmp,tmp);
        
        if(b%2==1){
            tmp = multi(tmp,a);
        }
        return tmp;
    }
    public static int[][] multi(int[][]a, int[][] b){
        int[][] tmp = new int[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
              for(int k=0; k<N; k++){
                  tmp[i][j]+= a[i][k] * b[k][j]%mod;
                  tmp[i][j]=tmp[i][j]%mod;
              }  
            }
        }
        return tmp;
    }
}
