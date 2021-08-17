package 정수론;

import java.io.*;
import java.util.*;

public class _5086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int first,second;
    
        while(true){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            first=Integer.parseInt(st.nextToken());
            second=Integer.parseInt(st.nextToken());
            if(first==0 && second==0) break;
            if(first%second==0) bw.write("multiple"+"\n");
            else if(second%first==0) bw.write("factor"+"\n");
            else bw.write("neither"+"\n");
        }
        bw.flush();

    }    
}
