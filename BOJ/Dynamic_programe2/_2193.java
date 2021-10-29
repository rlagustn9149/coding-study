package BOJ.Dynamic_programe2;
import java.util.*;
public class _2193 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] arr= new long[N][2];

        arr[0][0]=0;
        arr[0][1]=1;

        for(int i=1; i<N; i++){
            arr[i][0]=arr[i-1][0]+arr[i-1][1];
            arr[i][1]=arr[i-1][0];
        }
        System.out.println(arr[N-1][0]+arr[N-1][1]);

    }
}
