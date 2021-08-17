package Que;
import java.io.*;
import java.util.*;
public class _1021 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        LinkedList<Integer> arr = new LinkedList<>();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++) arr.add(i+1);
        int count=0;
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<m; i++){
            
            int num = Integer.parseInt(st1.nextToken());
            int index = arr.indexOf(num);
            if(index <= arr.size()/2){
                while(num!=arr.getFirst()){
                    arr.add(arr.removeFirst());
                    count++;
                }
            }else{
                while(num!=arr.getFirst()){
                    arr.addFirst(arr.removeLast());
                    count++;
                }
            }
            arr.remove();
        }
        System.out.println(count);
    }
}
