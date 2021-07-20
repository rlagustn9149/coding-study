package 그리디;

import java.io.*;
import java.util.*;

public class _13305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long dist[] = new long[n-1];
        long cost[][] = new long[n][2];

        StringTokenizer di = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n-1; i++){
            dist[i]=Long.parseLong(di.nextToken());
        }
        StringTokenizer co = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            cost[i][0]=Long.parseLong(co.nextToken());
            cost[i][1]=i;
        }
        Arrays.sort(cost, new Comparator<long[]>(){
            public int compare(long[] a1, long[] a2){
                if(a1[0]==a2[0])
                    return (int) (a1[1]-a2[1]);
                else return (int) (a1[0]-a2[0]);
            }
        });
        
        long sum=0;
        long check=n-1;

        for(int i=0; i<n; i++){
            if(cost[i][1]<check){
                for(int j=(int) cost[i][1]; j<check; j++){
                    sum+=cost[i][0]*dist[j];
                }
                check=cost[i][1];
            }  
        }
        System.out.println(sum);
    }
}
