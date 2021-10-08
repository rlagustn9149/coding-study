package BOJ.Dynamic_programe2;
import java.util.*;
public class _2629 {

    static HashSet<Integer> hs = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // 추의 개수
      
        String[] tmp = sc.nextLine().split(" ");
        for(int i=0; i<n; i++){
            make(Integer.parseInt(tmp[i]));
        }
    
        int check = Integer.parseInt(sc.nextLine());
        String[] t = sc.nextLine().split(" ");
        for(int i=0; i<check; i++){
            if(hs.contains(Integer.parseInt(t[i]))) System.out.print("Y ");
            else System.out.print("N "); 
        }

    }

    public static void make(int tmp){
    
        HashSet<Integer> t = new HashSet<>();

        Iterator iter = hs.iterator();
        while(iter.hasNext()){
            int x = (int)iter.next();
            int plus = x+tmp;
            int minus=0;
            if(x>tmp) minus = x-tmp;
            else minus= tmp-x;

            t.add(plus);
            t.add(minus);
        }

        Iterator it = t.iterator();
        while(it.hasNext()){
            hs.add((int)it.next());
        }

       hs.add(tmp); 
    }
 
}
