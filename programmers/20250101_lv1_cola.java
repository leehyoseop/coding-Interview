class Solution {
    public int solution(int a, int b, int n) {
    int answer = 0;
    int n_cola = 0;
    int n_beforeEmpty = n;
    int n_afterEmpty = n_cola + n_beforeEmpty;

    while(n_afterEmpty >= a){
     n_cola = (n_afterEmpty/a) * b;
     n_beforeEmpty = (n_afterEmpty%a);
     n_afterEmpty = n_cola + n_beforeEmpty;
     answer += n_cola;
    }
    return answer;
    }
}