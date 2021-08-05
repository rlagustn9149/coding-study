package programmers;
public class 숫자와문자열과영단어 {
    class Solution {
        public int solution(String s) {
            String[] numArr={"zero", "one", "two","three","four","five","six","seven","eight","nine"};
            
            for(int i=0; i<numArr.length; i++){
                s=s.replace(numArr[i], Integer.toString(i));
            }
            return Integer.parseInt(s);
        }
    }
}
