function fib() {
  let sum = [1, 2];

  while (true) {
    const inc = sum[sum.length-1] + sum[sum.length-2];
    if (inc > 4000000) break;
    sum.push(inc)
  }

  return sum.reduce((acc , val) => val % 2 == 0 ? acc + val : acc, 0);
}

console.log(fib());
