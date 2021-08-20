package 동적계획법;


import java.io.*;

public class _1463 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        if(n>=1) arr[1]=0;     
    

        for(int i=2; i<=n; i++){
            int _3=10000000, _2=10000000, _1=10000000;
            if(i%3==0) {_3 = arr[i/3]; }
            if(i%2==0) {_2 = arr[i/2]; }
            _1 = arr[i-1]; 
            arr[i]=Math.min(Math.min(_3,_2),_1)+1;
        }

        System.out.println(arr[n]);
    }
}
