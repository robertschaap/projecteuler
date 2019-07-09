fn num1() -> u32 {
  let mut sum = 0;

  for n in 0..1000 {
    if n % 3 == 0 || n % 5 == 0 {
      sum += n;
    }
  }

  return sum;
}

fn num2() -> u32 {
  (0..1000).fold(0, |acc, val| if val % 3 == 0 || val % 5 == 0 {acc + val} else {acc})
}

fn main() {
  println!("Result: {}", num1());
  println!("Result: {}", num2());
}
