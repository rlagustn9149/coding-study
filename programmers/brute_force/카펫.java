package programmers.brute_force;

public class 카펫 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            
            int total = brown + yellow;
            
            for(int i= 2; i<= total/2; i++){
                if(total%i==0){
                    int x = total/i;
                    int y = i;
                    
                    int check = x+x+y+y-4;
                    if(check == brown){
                        answer[0]=x;
                        answer[1]=y;
                        break;
                    }
                }
            }
            
            return answer;
        }
    }
}
