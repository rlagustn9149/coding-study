package 정렬;

import java.io.*;
import java.util.*;

public class _10814{
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        String[][] arr = new String[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
        }

        Arrays.sort(arr,new Comparator<String[]>(){
            public int compare(String[] s1, String[] s2){
                return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
            }
        });

        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<n; i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
    }
}