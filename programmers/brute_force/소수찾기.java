package programmers.brute_force;
import java.util.*;
public class 소수찾기 {
class Solution {
    boolean[] visit;
    char[] arr;
    HashSet<Integer> set = new HashSet<>();
    
    public boolean Prime(int num){
        if(num==1 || num ==0) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        
        return true;
    }
    
    public void dfs(int level, int length, String Numbers){
        if(length==level){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< length; i++){
                sb.append(arr[i]);
            }
            int num = Integer.parseInt(sb.toString());
            if(Prime(num)) set.add(num);
        } else{
            for(int i=0; i<Numbers.length(); i++){
                if(!visit[i]){
                    visit[i]=true;
                    arr[level]=Numbers.charAt(i);
                    dfs(level+1,length, Numbers);
                    visit[i]=false;
                }
            }
        }
    }
    
    public int solution(String numbers) {
        visit = new boolean[numbers.length()];
        arr = new char[numbers.length()];
        
        for(int i=1; i<=numbers.length(); i++){
            dfs(0,i,numbers);
        }
        return set.size();
    }
}
}
