class Solution {
    public int solution(int[] number) {
    int answer = 0;
    int startPoint = 0;

    while(startPoint <= number.length-3) {
        for(int middlePoint = startPoint+1; middlePoint < number.length; middlePoint++) {
          for(int finalPoint = middlePoint+1; finalPoint < number.length; finalPoint++) {
            if(number[startPoint] + number[middlePoint] + number[finalPoint] == 0) {
              answer++;
            }
          }
        }
        startPoint++;
    }
    return answer;
  }
}