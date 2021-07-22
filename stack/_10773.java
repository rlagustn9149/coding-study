package stack;
import java.io.*;
public class _10773 {
    
    static int[] stack;
    static int size=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        stack=new int[n];
        while(n>0){
            int k=Integer.parseInt(br.readLine());
            if(k==0) pop();
            else push(k);
            n--;
        }
        int sum=0;
        for(int i=0; i<size; i++){
            sum+=stack[i];
        }
        System.out.println(sum);
    }
    public static void push(int x){
        stack[size++]=x;
    }
    public static void pop(){
        stack[--size]=0;
    }
}
