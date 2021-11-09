package BOJ.Dynamic_programe2;
import java.util.*;
public class _1699 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[1]=1;
        int k=2;
        for(int i=2; i<=n; i++){
            if(k*k == i){ dp[i]=1; k++; }
            else{
                dp[i]=100000000;
                
                for(int j=1; j<=k-1; j++){
                    int tmp = j*j;
                    dp[i] =Math.min(dp[i], dp[i-tmp] + dp[tmp]);
                }
            }
        }

        System.out.println(dp[n]);
    }
}
