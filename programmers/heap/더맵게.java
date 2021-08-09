package programmers.heap;
import java.util.*;
public class 더맵게 {
class Solution {
    
    PriorityQueue<Integer> heap;
    public void order(int[] s){
        for(int h : s){
            heap.add(h);
        }
    }    
    public int solution(int[] scoville, int K) {
        int answer = 0;
        heap = new PriorityQueue<>();
        order(scoville);
        
        while(heap.peek() < K){
            if(heap.size() ==1 ) return -1;
            
            int a = heap.remove();
            int b = heap.remove();
            int c = a+ (b*2);
            heap.add(c);
            answer++;
        }       
        return answer;
    }
}
}
