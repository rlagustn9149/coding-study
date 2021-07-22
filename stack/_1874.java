package stack;
import java.io.*;
public class _1874 {
    
    static int[] stack;
    static int size=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int j=1;
        stack= new int[n];
        for(int i=0; i<n; i++) {
            int input= Integer.parseInt(br.readLine());
            while(input>=j){
                push(j);
                bw.write("+"+"\n");
                j++;
            }
            if(input<j){
                if(get()==input)
                {
                    pop(); 
                    bw.write('-'+"\n");
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        bw.flush();
       
    } 
    public static int get(){
        return stack[size-1];
    }
    public static void push(int x){
        stack[size++]=x;
    }
    public static void pop(){
        --size;
    }

}
