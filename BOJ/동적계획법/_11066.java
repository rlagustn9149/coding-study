package 동적계획법;
import java.io.*;
import java.util.*;
public class _11066 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int k=Integer.parseInt(br.readLine());
            int[] arr=new int[k];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<k; j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
        }
    }    
}
