package programmers.sorting;
import java.util.*;
public class H_Index {
class Solution {
    public int solution(int[] citations) {
    
        Arrays.sort(citations);      
        int max=0;       
        for(int i=0; i<citations.length; i++){
            if(citations[i]<=citations.length-i) max=citations[i];
            else{
                int tmp = max;
                for(int j=max; j<citations[i]; j++){
                    if(j <= citations.length-i) tmp=j;
                }
                return tmp;
            }
        }
     
        return max;
    }
}
}
