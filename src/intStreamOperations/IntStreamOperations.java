package intStreamOperations;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        int [] arrays = {5, 2,6,3,8,7,9,1,4};
        System.out.println("original values: ");
        System.out.println(IntStream.of(arrays)
                .mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        System.out.print("count: ");

        System.out.println(IntStream.of(arrays).count());
        System.out.print("Min: ");
        System.out.println(IntStream.of(arrays).min().getAsInt());
        System.out.print("Max: ");
        System.out.println(IntStream.of(arrays).max().getAsInt());
        System.out.print("Sum: ");
        System.out.println(IntStream.of(arrays).sum());
        System.out.print("Average: ");
        System.out.printf("%.2f%n",IntStream.of(arrays).average().getAsDouble());
        System.out.printf("Sum via reduce function: %d%n", IntStream.of(arrays).reduce(0,(x,y) -> x + y));
        System.out.printf("Product via reduce function: %d%n", IntStream.of(arrays).reduce((x,y) -> x * y).getAsInt());
        System.out.printf("Sum of square via map and sum: %d%n", IntStream.of(arrays).map(x -> x * x).sum());
        System.out.printf("Values displayed in sorted order: %s%n", IntStream.of(arrays).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        System.out.printf("Using method summary statistics: %s%n", IntStream.of(arrays).summaryStatistics());
    }
}
