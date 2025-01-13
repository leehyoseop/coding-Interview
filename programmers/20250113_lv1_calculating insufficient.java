class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i = 1; i<=count; i++){
            sum += i;
        }
        answer = price*sum - money;
        if(answer<=0){
            answer = 0;
        }
        return answer;
    }
}