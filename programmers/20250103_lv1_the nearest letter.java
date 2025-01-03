import java.util.ArrayList;
import java.util.List;

public class Solution {
  public int [] solution(String s) {
    int[] answer = {};
    String[] arrWord = {};

    arrWord = s.split("");
    answer = new int[arrWord.length];

    for(int i=0; i < arrWord.length; i++){
      String c = arrWord[i];

      // if(c.equals("")){
      //   continue;
      // }

      ArrayList<Integer> tmp = new ArrayList<>();

      Boolean noMatch = true;

      for(int j=0; j < arrWord.length; j++){
        if(c.equals(arrWord[j])){
          arrWord[i] = "";
          arrWord[j] = "";
          tmp.add(j);
          noMatch = false;
        }
      }

      if(noMatch){
        arrWord[i] = "";
        answer[i] = -1;
      } else {
        for(int k=0; k < tmp.size(); k++){
          if(k==0){
            answer[tmp.get(k)] = -1;
          } else {
            answer[tmp.get(k)] = tmp.get(k) - tmp.get(k-1);
          }
        }
      }
    }
    return answer;
  }
}