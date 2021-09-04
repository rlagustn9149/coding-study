package BOJ.Dynamic_programe2;
import java.util.*;
public class _2293 {
    static int[] value;
    static int[] coin;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split(" ");

        int n= Integer.parseInt(tmp[0]);
        int k= Integer.parseInt(tmp[1]);

        value= new int[k+1];
       
        coin = new int[n];
        for(int i=0; i<n; i++){
            coin[i]=sc.nextInt();
        }
        Arrays.sort(coin);

        value[0]=1;
        for(int i=0; i<n; i++){
            for(int j=coin[i]; j<=k; j++){
                value[j]+=value[j-coin[i]];
            }
        }

        System.out.println(value[k]);

    }
 
}
