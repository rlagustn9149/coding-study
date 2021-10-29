package BOJ.Dynamic_programe2;
import java.util.*;
import java.io.*;
public class _9465 {
    
    static int[][] stick;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            stick = new int[n][2];
            for(int k=0; k<2; k++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                for(int j=0; j<n; j++){
                    stick[k][j]=Integer.parseInt(st.nextToken());
                }
            }
        }
    }
}
