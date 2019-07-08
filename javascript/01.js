function sum1() {
  let sum = 0;
  for (let i = 1; i < 1000; i++) {
    if (i % 3 === 0 || i % 5 === 0) {
      sum += i;
    }
  }
  return sum;
}

console.log(sum1());

const sum2 = () => Array(1000).fill().reduce((acc, val, idx) => (
  (idx % 3 === 0 || idx % 5 === 0) ? acc + idx : acc), 0
);

console.log(sum2());
