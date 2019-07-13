package main

func sum1() int {
	sum := 0

	for i := 0; i < 1000; i++ {
		if i % 3 == 0 || i % 5 == 0 {
			sum += i
		}
	}

	return sum
}

func sum2() int {
	var sum int
	var a [1000]int

	for i := range a {
		if i % 3 == 0 || i % 5 == 0 {
			sum += i
		}
	}

	return sum
}
