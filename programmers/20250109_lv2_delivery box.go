func solution(order []int) int {
	stack := []int{}
	index := 0
	currentBox := 1
	// 아직 푸는 중.
	// 아래는 ChatGPT, 논리는 비슷한데, 흠...
	for _, box := range order {
		// Continue pushing to the stack until we find the target box
		for currentBox <= len(order) && currentBox != box {
			stack = append(stack, currentBox)
			currentBox++
		}

		// If the current box matches the order, just move to the next one
		if currentBox == box {
			index++
			currentBox++
		} else if len(stack) > 0 && stack[len(stack)-1] == box {
			// If the box is on the top of the stack, pop it
			stack = stack[:len(stack)-1]
			index++
		} else {
			// If we can't match the current order box, we should break
			break
		}
	}

	return index
}