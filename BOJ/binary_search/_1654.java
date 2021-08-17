package binary_search;
import java.io.*;
import java.util.*;
public class _1654 {
    
    static long[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n= Integer.parseInt(st.nextToken());
        int k= Integer.parseInt(st.nextToken());
        arr=new long[n];
        long end=0;
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(br.readLine());
            end = Math.max(end,arr[i]);
        }
        Arrays.sort(arr);
        long start =1;
        long max=0;

        while(true){
            
            if(start>end) break;
            long mid=(end+start)/2;
           
            int count=0;
            for(int i=0; i<n; i++){
                count +=arr[i]/mid;
            }
            if(count>=k){
                max=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(max);
    }   
}
