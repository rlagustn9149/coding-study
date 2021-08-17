package 정수론;
import java.io.*;
import java.util.*;
public class _2004 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int k=n-m;
        int five,two;
        five=five(n);
        five-=five(m);
        five-=five(k);

        two=two(n);
        two-=two(m);
        two-=two(k);
        
        System.out.println(Math.min(five,two));
    }
    public static int five(int n){
        int cnt=0;
        while(n>=5){
            cnt+=n/5;
            n/=5;
        }
        return cnt;
    }
    public static int two(int n){
        int cnt=0;
        while(n>=2){
            cnt+=n/2;
            n/=2;
        }
        return cnt;
    }

}
