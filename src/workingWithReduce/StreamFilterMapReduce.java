package workingWithReduce;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0).map(x -> x * 3).sum();
        System.out.println(sum);
    }
}
