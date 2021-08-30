package programmers.bfs_dfs;
import java.util.*;
public class 여행경로{
    
    class Solution {    
        ArrayList<String> arr = new ArrayList<>();
        String[][] Tickets;
        boolean[] visit;
        
        void dfs(String str,String tmp,int index, int target){
            
            if(index == target) {
                arr.add(str);
            }
            
            for(int i=0; i<Tickets.length; i++){
                if(!visit[i] && Tickets[i][0].equals(tmp)){
                    visit[i]=true;
                    dfs(str+" "+Tickets[i][1],Tickets[i][1], index+1, target);
                    visit[i]=false;
                }
            }
            
        }
        
        public String[] solution(String[][] tickets) {
                
            Tickets = tickets;
            visit= new boolean[tickets.length];
            
            String str="ICN";
            dfs(str,"ICN",0,Tickets.length);
               
            Collections.sort(arr);        
            return arr.get(0).split(" ");
        }
    }
}