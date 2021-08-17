package stack;
import java.io.*;
public class _9012 {

    static int stack;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k=Integer.parseInt(br.readLine());

        while(k>0){
            String input= br.readLine();
            stack=0;
            for(int i=0; i<input.length(); i++){
                switch(input.charAt(i)){
                    case '(' : push(); break;
                    case ')' : pop(); break;
                }
            }
            if(stack==0) bw.write("YES\n");
            else bw.write("NO\n");
            k--;
        }
        bw.flush();
    }
    public static void push(){
        if(stack<0) return;
        else stack++;
    }
    public static void pop(){
        stack--;
    }
}
