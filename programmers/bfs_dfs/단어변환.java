package programmers.bfs_dfs;

public class 단어변환 {
    class Solution {
    
        int answer=Integer.MAX_VALUE;
        String Target="";
        String[] Words;
        boolean[] visit;
        
        public int check(String start, String target){
            int count=0;
            char[] st= start.toCharArray();
            char[] ta= target.toCharArray();
            for(int i=0; i<st.length; i++){
                if(st[i]!=ta[i]) count++;
            }
            return count;
        }
        
        public void dfs(String start, int count){
            
            if(start.equals(Target)){
                answer = Math.min(answer,count);
                return;
            }
            
            for(int i=0; i< visit.length; i++){
                if(!visit[i]){
                    if(check(start,Words[i])==1){
                        visit[i]=true;
                        dfs(Words[i], count+1);
                        visit[i]=false;
                    }
                }
            }   
        }
        
        
        public int solution(String begin, String target, String[] words) {
            
            Target=target;
            visit= new boolean[words.length];
            Words=words;
            
            for(int i=0; i<words.length; i++){
                dfs(begin,0);
            }     
            if(answer == Integer.MAX_VALUE) answer=0;        
            return answer;
        }
    }
}
