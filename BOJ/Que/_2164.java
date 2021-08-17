package Que;
import java.io.*;
public class _2164 {
    static int[] que;
    static int size=0;
    static int front=0;
    static int back=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        que=new int[2*n];
        size=n;

        for(int i=1; i<=n; i++){que[i-1]=i; back++;}
        while(size>1){
            dump();
            back();
        }
        System.out.println(que[front]);
    }
    public static void dump(){
        front++;
        size--;
    }
    public static void back(){
        que[back]=que[front];
        back++;
        front++;
    }
}
