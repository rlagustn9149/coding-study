package 정렬;

import java.io.*;
import java.util.*;


public class _1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());

        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i]=bf.readLine();
        }
        
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length()-s2.length();
                }
            }
        });
       
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n-1; i++){
            if(!arr[i].equals(arr[i+1])){
                bw.write(arr[i]+"\n");
            }
        }
        bw.write(arr[n-1]);
        bw.flush();
    }
}
