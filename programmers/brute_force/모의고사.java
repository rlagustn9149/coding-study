package programmers.brute_force;
import java.util.*;

public class 모의고사{
class Solution {
    public int[] solution(int[] answers) {
        int a=0,b=0,c=0;
        int[] a_answer={1,2,3,4,5};
        int[] b_answer={2,1,2,3,2,4,2,5};
        int[] c_answer={3,3,1,1,2,2,4,4,5,5};
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a_answer[i%5]) a++;
            if(answers[i]==b_answer[i%8]) b++;
            if(answers[i]==c_answer[i%10]) c++;
        }
        int max= Math.max(Math.max(a,b),c);
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(max == a) arr.add(1);
        if(max == b) arr.add(2);
        if(max == c) arr.add(3);
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i]=arr.get(i);
        }
        
        return answer;
    }
}
}