package 동적계획법;

import java.io.*;


public class _9251 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();

        int str1_len=str1.length;
        int str2_len=str2.length;
        int[][] arr=new int[str1_len+1][str2_len+1];

        for(int i=1; i<=str1_len; i++){
            for(int j=1; j<=str2_len; j++){
                if(str1[i-1]==str2[j-1]) arr[i][j]=arr[i-1][j-1]+1;
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        System.out.println(arr[str1_len][str2_len]);
    }   
}
