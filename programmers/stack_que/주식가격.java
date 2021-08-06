package programmers.stack_que;
import java.util.*;
public class 주식가격 {
   public static void main(String[] args){
        int[] arr={1,2,3,2,3};
        Solution s = new Solution();
        int[] answer = s.solution(arr);

        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]);
        }
   }
}

class Solution {
    public int[] solution(int[] prices) {
        int[][] arr = new int[prices.length][2];
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            arr[i][0]=i+1;
            arr[i][1]=prices[i];
        }
        
        Arrays.sort(arr, new Comparator<int[]>(){
           @Override
           public int compare(int[] o1, int[] o2){
               if(o1[1]==o2[1]){ 
                   return o1[0]-o2[0];
               }else{
                   return o2[1]-o1[1];
               } 
           } 
        });
        
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i][0]+" "+arr[i][1]);

        for(int i=0; i< prices.length; i++){
            int check = arr[i][1];
            int cnt = arr[i][0];
            if(cnt==prices.length) answer[i]=0;
            if(i==prices.length-1) answer[i]=prices.length-cnt;
            else{
                for(int j=i+1; j< prices.length; j++){
                    
                    if(check>arr[j][1] && cnt < arr[j][0])
                    {
                        System.out.println(i);
                        answer[i]= (arr[j][0]-cnt);
                        break;
                    }
                    else{
                        answer[i]=prices.length-cnt;
                    }
                }
            }
        }
        return answer;
    }
}