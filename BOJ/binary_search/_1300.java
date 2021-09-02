package BOJ.binary_search;
import java.io.*;
import java.util.*;
public class _1300 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int k= Integer.parseInt(br.readLine());
      
        long left=1;
        long right=k;
        long answer=0;
        while(left<=right){
            long mid = (left+right)/2;
            long cnt=0;
            for(int i=1; i<=n; i++){
                    cnt+=Math.min(mid/i,n);
            }
            if(cnt<k){
                left=mid+1;
            }else{
                answer=mid;
                right=mid-1;
            }

        }
        System.out.print(answer);
     
        
    }
}
