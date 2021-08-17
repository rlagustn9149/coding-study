package Divide_Conquer;
import java.io.*;
import java.util.*;
public class _11401 {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        long x = factorial(n);
        long y = factorial(k)*factorial(n-k)%mod;
        System.out.println(x*multi(y,mod-2)%mod);
    }
    public static long factorial(int n){
        long fac =1;
        while(n>1){
            fac=(fac*n)%mod;
            n--;
        }
        return fac;
    }
    public static long multi(long x, long y){
        if(y==1) return x;

        long tmp=multi(x,y/2);

        if(y%2==1) return (tmp*tmp%mod)*x%mod;
        else return tmp*tmp%mod;
    }
}
