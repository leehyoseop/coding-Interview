import (
	"sort"
	"strconv"
	"strings"
)

func solution(s string) string {
	arrStr := strings.Split(s, " ")
	arrInt := []int{}

	for _, str := range arrStr {
		num, _ := strconv.Atoi(str)
		arrInt = append(arrInt, num)
	}

	sort.Ints(arrInt)

	min := strconv.Itoa(arrInt[0])
	max := strconv.Itoa(arrInt[len(arrInt)-1])
	return min + " " + max
}