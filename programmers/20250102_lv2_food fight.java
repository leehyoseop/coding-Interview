import java.util.*;
class Solution {
    public String solution(int[] food) {
    String answer = "";
    List<Integer> answerList = new ArrayList<>();

    for(int i=1; i < food.length;  i++){
      int selFood = food[i];
      if(selFood/2>=1){
        for(int j=1; j<= selFood/2; j++){
          answerList.add(i);
        }
      }
    }
    answerList.add(0);
    for(int k=answerList.size()-2; k >= 0;  k--){
      answerList.add(answerList.get(k));
    }

    for (Integer item : answerList) {
      answer += Integer.toString(item);
    }

    return answer;
  }
}