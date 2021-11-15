package BOJ.tree;
import java.io.*;
import java.util.*;
public class _9934 {
        

    static StringBuilder[] sb;
    static int k;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k= Integer.parseInt(br.readLine());
        int tmp = (int)Math.pow(2,k)-1;
        
        arr = new int[tmp];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<tmp; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }


        sb = new StringBuilder[k];
        for(int i=0; i<k; i++){
            sb[i]=new StringBuilder();
        }

      
        solution(0, tmp , 0);
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<k; i++){
            answer.append(sb[i].toString()).append("\n");
        }
        System.out.print(answer.toString());
    }

    public static void solution(int left, int right, int dept){

        if(dept == k) return; 
        
        int mid= (left+right)/2;
        sb[dept].append(arr[mid]+" ");

        solution(left, mid-1, dept+1);
        solution(mid+1, right, dept+1);
    }
}
