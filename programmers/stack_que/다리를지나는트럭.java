package programmers.stack_que;

public class 다리를지나는트럭 {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;
            int[] arr= new int[truck_weights.length];
            
            int first=0;
            int last=1;
            int wei= truck_weights[0];
            arr[0]=1;
            
            while(true){
                answer++;          
                if(answer-arr[first]==bridge_length) {                
                    wei -= truck_weights[first]; 
                    first++;
                    if(first==truck_weights.length) break;
                }     
                if(last<truck_weights.length)
                {   
                    if(last<answer)
                    {
                        if(wei+truck_weights[last]<=weight){
                            arr[last]=answer;
                            wei += truck_weights[last];
                            last++;      
                        }
                    }
                }     
            }
            return answer;
        }
    }
}
