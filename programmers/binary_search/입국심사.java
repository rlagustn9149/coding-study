package programmers.binary_search;
import java.util.*;
public class 입국심사 {
    public long solution(int n, int[] times) {
        long answer=0;
        long start =0;
        Arrays.sort(times);
        long end = (long)n * times[times.length-1];
        
        while(start<=end){
            long mid = (start+end)/2;
            long sum=0;
            for(int i=0; i<times.length; i++){
                sum = sum + mid/times[i];         
            }
            
            if(sum<n){
                start = mid+1;
            }else{
                end = mid-1;
                 answer = mid;
            }
        }
        return answer;
    }
}
