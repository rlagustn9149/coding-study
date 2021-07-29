package Divide_Conquer;
import java.io.*;
public class _11444 {
    static long mod = 1000000007;
    static long[][] A ={{1,1},{1,0}};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        
        System.out.println(exp(A,n-1)[0][0]);
        
    }
    public static long[][] exp(long[][] a, long b){
        if(b==1 || b==0) return a;

        long[][] tmp = exp(a,b/2);
        tmp= multi(tmp,tmp);
        
        if(b%2==1) return multi(tmp,A);
        
        return tmp;
    }
    public static long[][] multi(long[][] a, long[][] b){
        long[][] tmp = new long[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                for(int k=0; k<2; k++){
                    tmp[i][j]+=a[i][k]*b[k][j]%mod;
                    tmp[i][j]=tmp[i][j]%mod;
                }
            }
        }
        return tmp;
    }
}
