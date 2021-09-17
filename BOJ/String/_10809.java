package String;
import java.util.*;
public class _10809 {
    public static void main(String[] args){
        int[] answer = new int[26];
        for(int i=0; i<26; i++){
            answer[i]=-1;
        }
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            char tmp = str.charAt(i);
            if(answer[tmp-'a']==-1) answer[tmp-'a']=i;

        }
        for(int i=0; i<26; i++)
            System.out.print(answer[i]+" ");
    }
}
