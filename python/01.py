from functools import reduce

def sum1():
  sum = 0

  for index in range(1000):
    if index % 3 == 0 or index % 5 == 0:
      sum += index

  return sum

print(sum1())

def sum2():
  return sum([index for index in range(1000) if index % 3 == 0 or index % 5 == 0])

print(sum2())

def sum3():
  return reduce(lambda acc,val: acc+val if val % 3 == 0 or val % 5 == 0 else acc, range(1000))

print(sum3())
