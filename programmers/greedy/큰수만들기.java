package programmers.greedy;
public class 큰수만들기 {
    class Solution {

        StringBuilder sb = new StringBuilder();
        public void findMax(String number, int k, int remove){
            if(k==remove) {
                sb.append(number);
                return;
            }
            if(number.length() == k-remove) return;

            int max=Integer.MIN_VALUE;
            int index=0;
            for(int i=0; i<=k-remove; i++){
                int num=(number.charAt(i)-'0');
                if(num>max){
                    max=num;
                    index=i;
                }
            }

            sb.append(max);
            findMax(number.substring(index+1),k,remove+index);
        }

        public String solution(String number, int k) {

            findMax(number,k,0);      
            return sb.toString();
        }
    }
}
