package 정렬;

import java.io.*;
import java.util.*;


public class _18870 {
    public static void main(String[] args) throws IOException{
      
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," "); 

        for(int i=0; i<n; i++){
            arr[i]= Integer.parseInt(st.nextToken());    
        }

        int[] arr1=arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(arr1[0], 0);
        int check = arr1[0];
        for(int i=1, j=1; i<n; i++){
            if(check != arr1[i]){
                map.put(arr1[i],j++);
                check=arr1[i];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n; i++){
            bw.write(map.get(arr[i])+" ");
        }

        bw.flush();
    }
}
