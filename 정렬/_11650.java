package 정렬;

import java.io.*;
import java.util.*;

public class _11650{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            arr[i][0]= Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] a, Integer[] b){
                if(a[0].equals(b[0])){
                    return a[1]-b[1];
                }
                else{
                    return a[0]-b[0];
                }
            }
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<n; i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
    }
}