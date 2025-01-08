// i)내가 접근한 방식 -> 시간복잡도 테스트케이스 2개 실패

// func solution(citations []int) int {

//     h := len(citations)

//     for{
//         cnt := 0

//         for _, v := range citations {
//             if(v >= h){
//                 cnt++
//             }
//         }

//         if(cnt == h) {
//             return h
//         } else {
//             h--
//         }
//     }
// }

import "sort"

func solution(citations []int) int {
	sort.Sort(sort.Reverse(sort.IntSlice(citations)))

	for i, v := range citations {
		if i >= v {
			return i
		}
	}

	return len(citations)
}