package programmers.sorting;
import java.util.*;
public class 가장큰수 {
class Solution {
    public String solution(int[] numbers) {
        
        StringBuilder sb= new StringBuilder();
        String[] str=new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            str[i]=String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if(str[0].equals("0")) return "0";   
        
        for(int i=0; i<str.length; i++) sb.append(str[i]);                  
       
        return sb.toString();
    }
}
}
