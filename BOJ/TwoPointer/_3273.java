package BOJ.TwoPointer;
import java.util.*;

public class _3273 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    int x= sc.nextInt();
    Arrays.sort(arr);
    int left=0;
    int right=n-1;
    int answer=0;
    while(left<right){
        int tmp = arr[left]+arr[right];
        if(tmp == x){
            answer++;
            left++;
        }
        else if(tmp < x){
            left++;
        }else{
            right--;
        }
    }
    System.out.print(answer);
  }
}
