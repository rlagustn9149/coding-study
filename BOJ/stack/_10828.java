package stack;
import java.io.*;
import java.util.*;
public class _10828 {
    
    public static int[] stack;
    static int size=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        stack=new int[n];
        
        while(n>0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(pop()+"\n");
                    break;
                case "size":
                    bw.write(size()+"\n");
                    break;
                case "empty":
                    bw.write(empty()+"\n");
                    break;
                case "top":
                    bw.write(top()+"\n"); 
            }
            n--;
        }
        bw.flush();
    }
    public static void push(int x){
        stack[size++]=x;
    }
    public static int pop(){
        if(size==0) return -1;
        return stack[--size];
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if(size==0) return 1;
        return 0;
    }
    public static int top(){
        if(size==0) return -1;
        return stack[size-1];
    }    
}
