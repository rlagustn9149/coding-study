package Divide_Conquer;
import java.io.*;
import java.util.*;
public class _2740 {

    static int[][] A;
    static int[][] B;
    static int[][] C;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine()," ");
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        A=new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<M; j++){
                A[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int K=Integer.parseInt(br.readLine().split(" ")[1]);
        B=new int[M][K];
        C=new int[N][K];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<K; j++){
                B[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<K; j++){
                for(int k=0; k<M; k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
                sb.append(C[i][j]+" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }     
}
