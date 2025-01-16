class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int partialSum = 0;
        for(int element : numbers) {
            partialSum += element;
        }
        answer = 45 - partialSum;
        return answer;
    }
}