package stack;
import java.io.*;
import java.util.*;
public class _17298 {
    
    static int[] stack;
    static int size=0;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(br.readLine());
        
        stack=new int[n];
        arr=new int[n];

        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<n; i++){
            if(size==0){ push(i); }
            else if(arr[i]<=arr[stack[size-1]]) push(i);
            else{
            while(size>0 && arr[i]>arr[stack[size-1]]){
                arr[stack[size-1]]=arr[i];
                pop();
            }
            push(i);
            }
        }
        while(size>0){
            arr[pop()]=-1;
        }
        for(int i=0; i<n; i++)
            bw.write(arr[i]+" ");
        bw.flush();
    }

    public static void push(int x){
        stack[size++]=x;
    }
    public static int pop(){
        return stack[--size];
    }
}
