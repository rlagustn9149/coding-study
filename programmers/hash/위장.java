package programmers.hash;
import java.util.*;
public class 위장 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            HashMap<String, Integer> hm = new HashMap<>();
            
            for(String[] str : clothes){
                if(hm.containsKey(str[1])) hm.put(str[1],hm.get(str[1])+1);
                else hm.put(str[1],1);
            }
            for(String str : hm.keySet()){
                answer =answer *  (hm.get(str)+1);
            }
            
            
            return answer-1;
        }
    }
}
