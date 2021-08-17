package Divide_Conquer;
import java.io.*;
import java.util.*;
public class _1629 {
    static long c;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long a=Long.parseLong(st.nextToken());
        long b=Long.parseLong(st.nextToken());
        c=Long.parseLong(st.nextToken());

        System.out.println(mult(a,b));
    }

    public static long mult(long a,long b){
        if(b==1) return a%c;
        
        long tmp= mult(a,b/2);
        if(b%2==1){
            return (tmp*tmp)%c*a%c;
        }
        else{
            return tmp*tmp%c;
        }
    }
}
