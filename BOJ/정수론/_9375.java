package 정수론;
import java.io.*;
import java.util.*;
public class _9375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t_case=Integer.parseInt(br.readLine());
        for(int i=0; i<t_case; i++){
            int val=1;
            int n=Integer.parseInt(br.readLine());
            HashMap<String,Integer> map = new HashMap<>();
            for(int j=0; j<n; j++){
                String st= br.readLine().split(" ")[1];
                if(map.containsKey(st)) map.put(st,map.get(st)+1);
                else map.put(st,1);
            
            }
            for(int j: map.values()){
                val*= (j+1);
            }
            bw.write(val-1+"\n");
        }

        bw.flush();
    }    
}
