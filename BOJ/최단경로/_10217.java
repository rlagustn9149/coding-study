package BOJ.최단경로;
import java.util.*;
import java.io.*;
public class _10217 {

    static int N,M,K;
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T= Integer.parseInt(br.readLine());
    
    for(int i=0; i<T; i++){
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());    
    }
  }  
}
