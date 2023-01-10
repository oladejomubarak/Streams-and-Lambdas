package workingWithReduce;

import java.util.stream.IntStream;

public class SumEvenNums {
    public static void main(String[] args) {
      int sum =   IntStream.rangeClosed(1, 10).map((int x) -> {return x * 2;}).sum();
        System.out.println(sum);
    }
}
