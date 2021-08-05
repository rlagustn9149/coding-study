package programmers.hash;
import java.util.*;
public class 전화번호목록 {
    class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            HashMap<String,Integer> hm = new HashMap<>();
            for(String phone:phone_book){
                hm.put(phone,0);
            }
            
            for(int i=0; i<phone_book.length; i++){
                for(int j=0; j<phone_book[i].length(); j++){
                    if(hm.containsKey(phone_book[i].substring(0,j))) return false;
                }
            }
            return answer;
        }
    }
}
