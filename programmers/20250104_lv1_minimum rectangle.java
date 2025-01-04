class Solution {
    public int solution(int[][] sizes) {
    int answer = 0;
    int[][] turnSizes;

    turnSizes = turnCard(sizes);
    int maxWidth = turnSizes[0][0];
    int maxHeight = turnSizes[0][1];

    for(int i=0; i<turnSizes.length-1; i++){
      maxWidth = ((turnSizes[i+1][0] >= maxWidth) ? turnSizes[i+1][0] : maxWidth);
      maxHeight = ((turnSizes[i+1][1] >= maxHeight) ? turnSizes[i+1][1] : maxHeight);
    }
    answer = maxWidth*maxHeight;

    return answer;
  }

  private static int[][] turnCard(int[][] sizes){
    int tmp = 0;
    for (int[] oneCard : sizes) {
      if(oneCard[1]>oneCard[0]){
        tmp = oneCard[0];
        oneCard[0] = oneCard[1];
        oneCard[1] = tmp;
      }
    }
    return sizes;
  }
}