package priority_queue;
import java.io.*;
import java.util.*;
public class _1655 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        PriorityQueue<Integer> Maxheap=new PriorityQueue<>((o1,o2)->o2-o1);
        PriorityQueue<Integer> Minheap=new PriorityQueue<>((o1,o2)->o1-o2);
        
        int n= Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int input=Integer.parseInt(br.readLine());
            if(Maxheap.size()==Minheap.size()){
                Maxheap.add(input);
                if(Minheap.size()!=0 && Maxheap.peek()>Minheap.peek()){
                    Minheap.add(Maxheap.remove());
                    Maxheap.add(Minheap.remove());
                }
            }else{
                Minheap.add(input);
                if(Maxheap.peek()>Minheap.peek()){
                    Minheap.add(Maxheap.remove());
                    Maxheap.add(Minheap.remove());
                }
            }
            sb.append(Maxheap.peek()+"\n");
        }
       System.out.println(sb);
        
    }
}
