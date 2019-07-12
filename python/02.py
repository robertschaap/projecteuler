from functools import reduce

def fib():
  list = [1,2]

  while True:
    inc = list[len(list)-1] + list[len(list)-2]

    if inc > 4000000:
      break

    list.append(inc)

  return reduce(lambda acc,val: acc+val if val % 2 == 0 else acc, list)

print(fib())
