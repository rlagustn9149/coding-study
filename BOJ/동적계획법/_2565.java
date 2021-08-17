package 동적계획법;

import java.io.*;
import java.util.*;

public class _2565 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr= new int[n][2];
        int[] lts = new int[n];

        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a1, int[] a2){
                return a1[0]-a2[0];
            }
        });
        int max=0;
        for(int i=0; i<n; i++){
            lts[i]=1;
            for(int j=0; j<i; j++){
                if(arr[i][1]>arr[j][1] && lts[i]<=lts[j])
                    lts[i]=lts[j]+1;
            }
            if(max<lts[i]) max=lts[i];
        }

        System.out.println(n-max);
    }   
}
