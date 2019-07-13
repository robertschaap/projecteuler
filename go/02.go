package main

func fib() int {
	list := []int{1, 2}
	sum := 0

	for {
		inc := list[len(list)-1] + list[len(list)-2]

		if inc > 4000000 {
			break
		}

		if inc % 2 == 0 {
			sum += inc
		}

		list[0] = list[1]
		list[1] = inc
	}

	return sum
}
