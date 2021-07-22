package 동적계획법;

import java.io.*;

public class _1904 {
    
    public static int[] arr=new int[1000001];
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int n= Integer.parseInt(br.readLine());
        arr[1]=1;
        arr[2]=2;  
        System.out.println(tile(n));     
    }

    public static int tile(int n){
        
        if(arr[n]!=0) return arr[n];
        else{
            arr[n]=tile(n-1)+tile(n-2);
        }
        return arr[n]%=15746;
    }
}
