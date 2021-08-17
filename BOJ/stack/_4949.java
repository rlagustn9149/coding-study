package stack;
import java.io.*;
public class _4949 {
    
    public static int size;
    public static char[] stack=new char[101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            size=0;
            String check ="yes";
            String input = br.readLine();
            if(input.charAt(0)=='.') break;
            for(int i=0; i<input.length(); i++){
                switch(input.charAt(i)){
                    case '(':
                        push('(');
                        break;
                    case '[':
                        push('[');
                        break;
                    case ')':
                        if(pop()!='(') check="no";
                        break;
                    case ']':
                        if(pop()!='[') check="no";
                        break;
                    default:
                        break;
                }    
            }
            if(size()!=0) check="no";
            bw.write(check+"\n");
            
        }
        bw.flush();
    }
    public static  int size(){
        return size;
    }
    public static void push(char x){
        stack[size++]=x;
    } 
    public static char pop(){
        if(size==0) return '0';
        return stack[--size];
    }
}
