package BOJ.TwoPointer;
import java.io.*;
import java.util.*;
public class _2470 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int acid=arr[right], alkali=arr[left];
        int answer=Integer.MAX_VALUE;
        while(left<right){
            int tmp = arr[left]+arr[right];
            if(Math.abs(tmp)<answer){
                answer=Math.abs(tmp);
                acid=arr[right];
                alkali=arr[left];
            }

            if(tmp>0){
                right--;
            }else if( tmp==0){
                break;
            }else{
                left++;
            }
        }

        System.out.print(alkali+" "+acid);
    }
}
