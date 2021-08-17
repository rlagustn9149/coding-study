package binary_search;
import java.io.*;
import java.util.*;
public class _1920 {
    
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n= Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m=Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<m; i++){
            sb.append(binarySearch(0,n-1,Integer.parseInt(st.nextToken()))+"\n");
        }
        System.out.println(sb);
    }
    public static int binarySearch(int start, int end, int find){
       
        if(start>end) return 0;
        
        int mid=(start+end)/2;
        if(arr[mid]>find){
            return binarySearch(start,mid-1,find);
        }else if(arr[mid]<find){
            return binarySearch(mid+1,end,find);
        }else{
            return 1;
        }
    }
}
