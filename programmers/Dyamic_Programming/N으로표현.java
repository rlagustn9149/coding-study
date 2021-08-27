package programmers.Dyamic_Programming;
import java.util.*;
public class N으로표현 {
    
    // dfs를 이용한 풀이... 
    class Solution1 {
        int answer = -1;
        public void dfs(int N,int number, int count, int val){
            if(count > 8) return;
            if(number==val){
                if(answer > count || answer == -1) answer = count;
                return;
            }
            int x=0;
            for(int i=0; i<8; i++){
                x=x*10+N;
                dfs(N,number, count+1+i, val+x);
                dfs(N,number, count+1+i, val-x);
                dfs(N,number, count+1+i, val*x);
                dfs(N,number, count+1+i, val/x);
            }
        }
        
        public int solution(int N, int number) {
          
            dfs(N,number,0,0);
            return answer;
        }
    }

    // dp를 이용한 풀이 -> 5가 1,2,3...8개를 이용해 만들 수 있는 모든 조합을
    // hashset에 저장 한다.
    class Solution2 {  
    public int solution(int N, int number) {
        int answer =-1;
        Set<Integer>[] setArr = new Set[9];
        
        int x=N;
        for(int i=1; i<9; i++){
            setArr[i]=new HashSet<>();
            setArr[i].add(x);
            x= x*10+N;
        }
        
        for(int i=1; i<9; i++){
            for(int j=1; j<i; j++){
                for(Integer a: setArr[j]){
                    for(Integer b:setArr[i-j]){
                        setArr[i].add(a+b);
                        setArr[i].add(a-b);
                        setArr[i].add(b-a);
                        setArr[i].add(a*b);     
                        if(b != 0) setArr[i].add(a/b);
                        if(a != 0) setArr[i].add(b/a);
                    }
                }
            }
        }
        for(int i=1; i<9; i++){
            if(setArr[i].contains(number)){
                answer=i;
                break;
            }
        }
        
        return answer;
    }
    }
}
