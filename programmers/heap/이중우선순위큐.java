package programmers.heap;
import java.util.*;
public class 이중우선순위큐 {
class Solution {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    
    public void fuc(String[] str){
    
        if(str[0].equals("I"))
        {
            heap.add(Integer.parseInt(str[1]));
            maxheap.add(Integer.parseInt(str[1]));
         }   
        if(str[0].equals("D")){ 
            if(heap.size()>0){
                if(Integer.parseInt(str[1])>0){
                    int num = maxheap.poll();
                    heap.remove(num);
                }else{
                    int num =heap.poll();
                    maxheap.remove(num);
                }
            }
        }
    
    }
    
    public int[] solution(String[] operations) {
                 
        for(String s : operations){
            String[] arr= s.split(" ");
            fuc(arr);
        }
        int[] answer = new int[2];    
        if(maxheap.size()==0){ 
            answer[0]=0;
            answer[1]=0;
        }else{          
            answer[0]=maxheap.peek();
            answer[1]=heap.peek();
        }
        
        return answer;
    }
}
}
