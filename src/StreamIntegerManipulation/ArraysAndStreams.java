package StreamIntegerManipulation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams {
    public static void main(String[] args) {
        Integer[] values = {1,0,4,2,5,6,8,6,9,10};
        System.out.printf("Original values: %s%n", Arrays.asList(values));

        System.out.printf("Sorted values: %s%n ",
                Arrays.stream(values).sorted().collect(Collectors.toList())
                );
    }
}
