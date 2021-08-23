package programmers.bfs_dfs;
public class 타겟넘버{
class Solution {  
    int answer =0;
    int[] Numbers;
    int Target;
        
    public void bfs(int sum, int num){
        
        if(num == Numbers.length){
            if(sum==Target) answer++;
            return;
        }      
        bfs(sum+Numbers[num],num+1);
        bfs(sum-Numbers[num],num+1);             
    }
    
    public int solution(int[] numbers, int target) {
        Numbers= numbers;
        Target = target;
        
        bfs(0,0);
        
        return answer;
    }
}
}