package 정수론;
import java.io.*;

public class _1676 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int out=0;
        while(n>=5){
            out+=n/5;
            n=n/5;
        }
        System.out.println(out);
        
    }    
}
