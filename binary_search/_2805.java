package binary_search;
import java.io.*;
import java.util.*;
public class _2805 {
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st =new StringTokenizer(br.readLine()," ");
      int n=Integer.parseInt(st.nextToken());
      int m=Integer.parseInt(st.nextToken());

      int[] arr=new int[n];
      int start=0;
      int end=0;
      st=new StringTokenizer(br.readLine()," ");
      for(int i=0; i<n; i++){
          arr[i]=Integer.parseInt(st.nextToken());
          end = Math.max(end,arr[i]);
      }
      int mid=0;
      while(true){
        if(start>end) break;

        mid = (start+end)/2;
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]-mid>0)
                count+=arr[i]-mid;
        }

        if(count<m){
            end=mid-1;
        }else if(count>m){
            start=mid+1;
        }else{
            break;
        }
      }

      System.out.println(mid);
  }  
}
