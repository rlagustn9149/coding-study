package BOJ.tree;
import java.util.*;
import java.io.*;
public class _9372 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st =new StringTokenizer(br.readLine()," ");
            int country = Integer.parseInt(st.nextToken());
            int air = Integer.parseInt(st.nextToken());
            for(int j=0; j<air; j++){
                st = new StringTokenizer(br.readLine()," ");
            }
            sb.append(country-1).append("\n");
        }

        System.out.print(sb.toString());
    }
}
