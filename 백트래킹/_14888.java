package 백트래킹;

import java.util.*;
import java.io.*;

public class _14888 {
    
    public static int[] arr;
    public static int[] operator;
    public static int max=-1000000001;
    public static int min=1000000001;

    public static void main(String[] args) throws IOException{
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        arr= new int[n];
        operator= new int[4];
        

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st= new StringTokenizer(br.readLine()," ");
        for(int i=0; i<4; i++){
            operator[i]=Integer.parseInt(st.nextToken());
        }

        Cal(n,1,arr[0]);
        System.out.println(max);
        System.out.println(min);
    } 

    public static void Cal(int n, int m, int cal){
        if(n==m){
            if(min> cal) min=cal;
            if(max<cal) max= cal;
            return;
        }

        for(int i=0; i<4; i++){
            if(operator[i]>0){
                operator[i]--;

                switch(i){
                    case 0 : Cal(n,m+1,cal+arr[m]); break;
                    case 1 : Cal(n,m+1,cal-arr[m]); break;
                    case 2 : Cal(n,m+1,cal*arr[m]); break;
                    case 3 : Cal(n,m+1,cal/arr[m]); break;
                }
                operator[i]++;
            }
        }
    }


}
