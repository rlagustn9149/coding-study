package programmers;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long sum=0;
        for(int i=1; i<=count; i++){
            sum+=i*price;
        }    
        if(money>=sum) return 0;
        else return sum-money;
    }
}
