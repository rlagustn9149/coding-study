package binary_search;
import java.io.*;
import java.util.*;
public class _10816 {
    static int[] Arr=new int[10000001];
    static int[] minusArr=new int[10000001];
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<n; i++){
            int tmp= Integer.parseInt(st.nextToken());
            if(tmp>=0) Arr[tmp]++;
            else minusArr[-tmp]++;
        }

        int m= Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine()," ");
        for(int i=0; i<m; i++){
            int tmp= Integer.parseInt(st.nextToken());
            if(tmp>=0) sb.append(Arr[tmp]+" ");
            else sb.append(minusArr[-tmp]+" ");
        }
        System.out.println(sb);
    }
}
