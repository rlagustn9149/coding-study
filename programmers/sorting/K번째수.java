package programmers.sorting;
import java.util.*;
public class K번째수 {
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0, j=0; i<commands.length; i++){
            int[] subarr= new int[(commands[i][1]-commands[i][0])+1];
            int m=0;
            for(int k=commands[i][0]; k<=commands[i][1]; k++){
                subarr[m]=array[k-1];
                m++;
            }
                
            Arrays.sort(subarr);
            answer[j]=subarr[commands[i][2]-1];
            j++;
        }
        
        return answer;
    }
}
}
