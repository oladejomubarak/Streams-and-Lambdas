package StreamStringManipulation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAndStream2 {
    public static void main(String[] args) {
        String[] strings = {"red", "Yellow", "Green", "blue", "orange", "White", "black", "purple"};

        System.out.printf("Original array: %s%n", Arrays.asList(strings));

        System.out.printf("Array in uppercase: %s%n",
                Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

        System.out.printf("Strings less than n in ascending order: %s%n", Arrays.stream(strings)
                .filter(letter -> letter.compareToIgnoreCase("n") < 0).sorted(String.CASE_INSENSITIVE_ORDER).
                collect(Collectors.toList()));
    }

}
