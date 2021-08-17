package Que;
import java.io.*;
import java.util.*;
public class _10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> arr= new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] str = br.readLine().split(" ");
            switch(str[0]){
                case "push_front":
                    arr.offerFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back":
                    arr.offerLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front":
                    if(arr.isEmpty()) sb.append("-1"+"\n");
                    else sb.append(arr.pollFirst()+"\n");
                    break;
                case "pop_back":
                    if(arr.isEmpty()) sb.append("-1"+"\n");
                    else sb.append(arr.pollLast()+"\n");
                    break;
                case "size":
                    sb.append(arr.size()+"\n");
                    break;
                case "empty":
                    if(arr.isEmpty()) sb.append("1"+"\n");
                    else sb.append("0"+"\n");
                    break;
                case "front":
                    if(arr.isEmpty()) sb.append("-1"+"\n");
                    else sb.append(arr.peekFirst()+"\n");
                    break;
                case "back":
                    if(arr.isEmpty()) sb.append("-1"+"\n");
                    else sb.append(arr.peekLast()+"\n");
                    break;

            }
        }
        System.out.print(sb);
    }
}
