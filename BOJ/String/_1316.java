package String;
import java.util.*;
public class _1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int answer=0;
        for(int i=0; i<t; i++){
            String str= sc.nextLine();
            boolean[] visit= new boolean[26];
            boolean check=false;
            char last= ' ';
            for(int j=0; j<str.length(); j++){
                char tmp=str.charAt(j);
                if(!visit[tmp-'a']){
                    last=tmp;
                    visit[tmp-'a']=true;
                }else{
                    if(last == tmp) continue;
                    else {check=true; break;}
                }
            }
            if(check) continue;
            answer++;
        }
        System.out.print(answer);
    }
}
