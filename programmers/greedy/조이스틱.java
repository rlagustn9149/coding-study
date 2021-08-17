package programmers.greedy;

public class 조이스틱 {
    class Solution {
        public int solution(String name) {
            int answer = 0;
            
            int[] beforeA=new int[name.length()];
            int[] A=new int[name.length()];
            int j=0;
            for(int i=0; i<name.length(); i++){
                char alphabet = name.charAt(i);
                
                if(A[j]!=0 && alphabet != 'A') {
                    j++;
                    beforeA[j]=beforeA[j]+beforeA[j-1]+A[j-1];                         
                } 
                if(A[j]==0 && alphabet != 'A') beforeA[j]++;
                if(alphabet=='A') A[j]++;
            }
            
            
            for(int i=0; i<name.length(); i++){
                
                char alphabet = name.charAt(i);
                answer++;
                if(alphabet>'N'){
                    int control = 'Z'-alphabet+1;
                    answer += control;
                }else if(alphabet<'N'){
                    int control = alphabet-'A';
                    answer += control;
                }else{
                    answer += 13;
                }
            }
            int minus=0;
            
            for(int i=0; i<name.length(); i++){
                if(A[i]>=beforeA[i] && A[i]!=0){
                    int min = (A[i]-beforeA[i])+1;
                    minus = Math.max(minus,min);
                }
            }
            
    
            
            return answer-1-minus;
        }
    } 
}
