package Que;
import java.io.*;
import java.util.*;
public class _5430 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            String f= br.readLine();
            int k=Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
            ArrayDeque<Integer> Deq = new ArrayDeque<Integer>();
            for(int j=0; j<k; j++){
                Deq.add(Integer.parseInt(st.nextToken()));
            }
            boolean front=true;
            boolean check =true;
            for(int j=0; j<f.length(); j++){
                char s =f.charAt(j);

                switch(s){
                    case 'R':
                        if(front) front=false;
                        else front=true;
                        break;
                    case 'D':
                        if(Deq.size()==0){sb.append("error\n"); check=false;}
                        else {
                            if(front) Deq.pollFirst();
                            else Deq.pollLast();
                        }
                        break;
                }
            }
            if(check){
                sb.append('[');
                if(Deq.size()>0){
                if(front){
                    sb.append(Deq.pollFirst());
                    while(!Deq.isEmpty())
                     sb.append(',').append(Deq.pollFirst());
                }else{
                    sb.append(Deq.pollLast());
                    while(!Deq.isEmpty())
                     sb.append(',').append(Deq.pollLast());
                }
            }
                sb.append(']').append('\n');
            }
        }
        System.out.print(sb);
    }
}
