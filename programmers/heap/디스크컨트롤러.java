package programmers.heap;
import java.util.*;
public class 디스크컨트롤러 { 
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time=0;
        int succed=0;
        boolean check= false;
        
        Arrays.sort(jobs, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[0]==o2[0]) return o1[1]-o2[1];
                else return o1[0]-o2[0];
            }
        });
       
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int finish=Integer.MAX_VALUE;
        int jobindex=0;
        int sum=0;
        while(succed<jobs.length){
           
            if(finish<=time) {
                check=false; 
                sum = sum+time-jobs[succed][0];
                succed++; 
                finish=Integer.MAX_VALUE; 
            }
            
            while(jobindex<jobs.length && jobs[jobindex][0]<=time){
                heap.add(jobs[jobindex++][1]);
            } 
            if(!check && heap.size()!=0){
                finish = time + heap.remove();
                check=true;
            }
            time++;
        }
        answer = sum;
        return (int)answer/jobs.length;
    }
}
}
