package priority_queue;
import java.io.*;
import java.util.*;
public class _11279 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1,o2)-> o2-o1);
        int n= Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input==0 && heap.size()==0){
                sb.append(0+"\n");
            }else if(input==0){
                sb.append(heap.remove()+"\n");
            }else{
                heap.add(input);
            }
        }
        System.out.println(sb);
    } 
}
