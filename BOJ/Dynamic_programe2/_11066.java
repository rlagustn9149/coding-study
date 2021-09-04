package BOJ.Dynamic_programe2;
import java.util.*;
import java.io.*;
public class _11066 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(br.readLine());
        StringBuilder sb= new StringBuilder();
    
        for(int i=0; i<testcase; i++){
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
            int[] arr=new int[size];
            int[][] dp = new int[size][size];
            
            for(int j=0; j<size; j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }

             

            //sb.append();
        }
        System.out.print(sb.toString());
    }

    
}
