package BOJ.dp;
import java.util.*;
public class _11052 {
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    
    int[] arr = new int[N+1];
    int[] dp= new int[N+1];
    for(int i=1; i<=N; i++){
      int tmp=sc.nextInt();
      arr[i]=tmp;
      dp[i]=tmp;
    }
    for(int i=1; i<=N; i++){
      for(int j=1; j<i; j++){
        dp[i]=Math.max(dp[i],dp[i-j]+arr[j]);
      }
    }
    System.out.println(dp[N]);
  }
}
