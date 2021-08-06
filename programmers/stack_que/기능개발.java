package programmers.stack_que;
import java.util.*;
public class 기능개발 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            
            int[] use_day=new int[progresses.length];
            List<Integer> s = new ArrayList<Integer>();
            for(int i=0; i<progresses.length; i++){
                if((100-progresses[i])%speeds[i]!=0) use_day[i]=(100-progresses[i])/speeds[i] +1;
                else use_day[i]= (100-progresses[i])/speeds[i];
            }
            
            int check=0;
            int count=0;
            for(int i=0; i<progresses.length; i++){
                if(check==0) {check = use_day[i]; count=1;  }
                
                else if(check>=use_day[i]) {count++;}
                else{
                    s.add(count);
                    count=1;
                    check=use_day[i];
                }
            }
            s.add(count);
            int[] answer = new int[s.size()];
            for(int i=0; i<answer.length; i++){
                answer[i]=s.get(i);
            }
            return answer;
        }
    }
}
