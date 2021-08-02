package binary_search;
import java.io.*;
import java.util.*;
public class _2110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int start= 1;
        int end = arr[n-1]-arr[0];

        while(start<=end){
            int mid=(start+end)/2;
            int mark =arr[0];
            int cnt =1;

            for(int i=1; i<n; i++){
                int dist=arr[i]-mark;
                if(mid<=dist){
                    cnt++;
                    mark=arr[i];
                }     
            }
            if(cnt>=c){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(end);
    }
}
