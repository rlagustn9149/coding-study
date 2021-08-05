package programmers.hash;
import java.util.*;
public class 완주하지못한선수 {
    class Solution {    
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> hm = new HashMap<>();
            String arr="";
            for(String player: participant){
                if(!hm.containsKey(player)) hm.put(player,1);
                else hm.put(player, hm.get(player)+1);
            } 
            for(String player: completion){
                hm.put(player,hm.get(player)-1);
            }
            for(String player: hm.keySet()){
                if(hm.get(player)!=0)
                    arr=player;
            }
            return arr;
        }
    }
}
