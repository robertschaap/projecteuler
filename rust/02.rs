fn fib() -> u32 {
  let mut inc;
  let mut myvec = vec![1,2];

  loop {
    inc = myvec[myvec.len()-1] + myvec[myvec.len()-2];
    println!("{}", inc);

    if inc > 4000000 {
      break;
    }

    myvec.push(inc);
  }

  return myvec.iter().fold(0, |acc, val| if val % 2 == 0 {acc + val} else {acc});
}

fn main() {
  println!("Result: {}", fib());
}
