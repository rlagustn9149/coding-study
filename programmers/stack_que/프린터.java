package programmers.stack_que;
import java.util.*;
public class 프린터 {
    class Solution {
        public int solution(int[] priorities, int location) {
            int answer = 0;
            int cnt=0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i : priorities){
                list.add(i);
            }
            while(list.size()>0){
                int first= list.get(0);
                boolean check =true;
                for(int i=1; i<list.size(); i++){
                    if(first<list.get(i)){
                        list.add(list.remove(0));
                        if(location>0) location--;
                        else location= list.size()-1;
                        check=false;
                        break;
                    }
                }
                if(check){
                    cnt++;
                    if(location==0) {answer= cnt; return answer;}
                    list.remove(0);
                    location--;
                }
            }
            
            return answer;
        }
    }   
}
