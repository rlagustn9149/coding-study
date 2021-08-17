package programmers.greedy;
import java.util.*;
public class 체육복 {
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count=0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j] && lost[i]!=-1 && reserve[j]!=-1){
                    lost[i]=-1;
                    reserve[j]=-1;
                    count++;
                    continue;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){           
                if(lost[i]==-1 || reserve[j]==-1){
                    continue;
                }         
                if(Math.abs(lost[i]-reserve[j])==1){
                    lost[i]=-1;
                    reserve[j]=-1;
                    count++;
                    
                }
            }
        }
        answer=n-(lost.length-count);
        return answer;
    }
}
}
