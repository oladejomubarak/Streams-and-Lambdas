package StreamIntegerManipulation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {1,0,4,2,5,7,8,6,9,10};
        System.out.printf("Original values: %s%n", Arrays.asList(values));

        System.out.printf("Sorted values: %s%n ",
                Arrays.stream(values).sorted().collect(Collectors.toList())
                );
        List <Integer> greaterThanFour = Arrays.stream(values).filter( x-> x > 4 ).collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThanFour);

        System.out.printf("Using greaterThan4 to sort in ascending order: %s%n",
                greaterThanFour.stream().sorted().collect(Collectors.toList()));
    }
}
