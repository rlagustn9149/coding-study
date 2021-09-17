package String;
import java.util.*;
public class _8958 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int T= Integer.parseInt(sc.nextLine());
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<T; i++){
            int answer=0;
            int s  = 1;
            String[] str = sc.nextLine().split("");
            for(int j=0; j<str.length; j++){
                if(str[j].equals("X")){
                    s=1;
                }else{
                    answer+=s;
                    s++;
                }
            }
            sb.append(answer+"\n");
        }
        System.out.println(sb.toString());
    }
}
