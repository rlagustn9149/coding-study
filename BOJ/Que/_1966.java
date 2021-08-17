package Que;
import java.io.*;
import java.util.*;
public class _1966 {
  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int _case=Integer.parseInt(br.readLine());
      
      for(int i=0; i<_case; i++){
          StringTokenizer st = new StringTokenizer(br.readLine()," ");
          int n,m;
          n=Integer.parseInt(st.nextToken());
          m=Integer.parseInt(st.nextToken());

          LinkedList<int[]> list = new LinkedList<>();
          StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
          for(int j=0; j<n; j++){
                list.offer(new int[]{j,Integer.parseInt(st1.nextToken())});
          }
          int count=0;
          while(!list.isEmpty()){
            boolean check=true;
            for(int j=0; j<list.size(); j++){
                if(list.get(0)[1]<list.get(j)[1]){
                    check=false;
                    break;
                }
            }
            if(!check){
                list.offer(list.poll());
            }
            else{
                
                int[] x= list.poll();
                count++;
                if(x[0]==m) {sb.append(count+"\n"); break;}
            }
          }

      }
      System.out.println(sb);
  }  
}
