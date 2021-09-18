package String;
import java.util.*;
public class _11718 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine()){
            String str= sc.nextLine();
            if(str==null || str.isEmpty() || str=="") break;
            sb.append(str+"\n");
        }
        System.out.println(sb.toString());
    }
}
