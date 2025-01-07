import ("math")

func solution(number int, limit int, power int) int {
    //i) 1~number 약수 개수 찾기 -> 시간복잡도 고려할것.
    var factorsSlice []int
    
    for i:=1; i<=number; i++{
        cnt:=0
        for j:=1; j<=int(math.Sqrt(float64(i))); j++{
            if(i%j == 0 && int(math.Pow(float64(j),2)) != i){
                cnt+=2
            } else if(i%j == 0 && int(math.Pow(float64(j),2)) == i) {
                cnt+=1
            }
        }
        factorsSlice = append(factorsSlice, cnt);
    }
    
    //ii) 약수개수와 limit 비교
    for idx, val := range factorsSlice{
        var tmpSlice []int
        if(val > limit) {
            tmpSlice = factorsSlice[idx+1:];
            factorsSlice = append(factorsSlice[:idx], power);
            factorsSlice = append(factorsSlice, tmpSlice...);
        }
    }
    
    //iii) 약수개수 sum
    result:=0
    for _ , val := range factorsSlice{
        result += val;
    }
    return result
}