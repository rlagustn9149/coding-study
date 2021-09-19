package String;
import java.util.*;
public class _11721 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            sb.append(c);
            if((i+1)%10==0) sb.append("\n");
                
        }   
        System.out.println(sb.toString());
    }
}
