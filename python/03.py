def largestPrimeFactor():
  number = 10
  divisor = 2

  while number > 1:
    if number % divisor == 0:
      number = number / divisor
    else:
      divisor+= 1

  return divisor

print(largestPrimeFactor())
