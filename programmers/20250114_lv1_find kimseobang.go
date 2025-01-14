import (
	"strconv"
)

func solution(seoul []string) string {

	location := 0

	for key, val := range seoul {
		if val == "Kim" {
			location = key
		}
	}

	answerStr := "김서방은 " + strconv.Itoa(location) + "에 있다"

	return answerStr
}