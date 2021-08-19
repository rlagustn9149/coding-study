package programmers.greedy;
import java.util.*;
public class 구명보트 { 
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int lp=0;
        int rp=people.length-1;
       
        while(lp<=rp){
            if(lp == rp) {answer++; break;}
            int tmp = people[lp]+people[rp];
            
            if(tmp>limit){
                answer++;
                rp--;
            }else{
                answer++;
                lp++;
                rp--;
            }
        }     
        return answer;
    }
}
}
