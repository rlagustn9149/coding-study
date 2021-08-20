package 그리디;

import java.io.*;
import java.util.*;


public class _1541 {
    
    public static int max=100000000;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer sub = new StringTokenizer(br.readLine(),"-");
        int sum=max;
        while(sub.hasMoreTokens()){
            int tmp =0;
            StringTokenizer add=new StringTokenizer(sub.nextToken(),"+");
            
            while(add.hasMoreTokens()){
                tmp+=Integer.parseInt(add.nextToken());
            }

            if(sum==max){
                sum=tmp;
            }else{
                sum-=tmp;
            }
        }
        System.out.println(sum);
    }
}
