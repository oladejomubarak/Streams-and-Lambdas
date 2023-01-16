import java.util.stream.IntStream;

public class IterateMethod {
    public static void main(String[] args) {
        Integer sumIt = IntStream.iterate(1, x -> x + 1)
                .map(x -> x * x)
                .limit(10)
                .sum();
        System.out.println(sumIt);
    }
}
