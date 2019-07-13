package injava;

import java.util.ArrayList;

public class T02 {
  public static Integer fib() {
    Integer sum = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);

    while (true) {
      int inc = list.get(list.size() - 1) + list.get(list.size() - 2);

      if (inc > 4000000) {
        break;
      }

      if (inc % 2 == 0) {
        sum += inc;
      }

      list.add(inc);
    }

    return sum;
  }
  public static void main(String[] args) {
    System.out.println(fib());
  }
}
