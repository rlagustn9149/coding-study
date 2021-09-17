package String;
import java.util.*;
public class _11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] str= sc.nextLine().split("");
        int sum=0;
        for(int i=0; i<str.length; i++){
            sum+=Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
