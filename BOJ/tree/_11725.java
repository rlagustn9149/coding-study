package BOJ.tree;
import java.util.*;
import java.io.*;
public class _11725 {
    
    static class node{
        int x;
        node child;
        public node(int x){
            this.x=x;
        }
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        node root = new node(1);

        for(int i=0; i<n-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            node tmp = new node(c);
            
        }
    }
}
