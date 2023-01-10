package randomNumberswithStream;

import java.security.SecureRandom;

public class RandomNumbersWithStream {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        randomNumbers.ints(10, 2 , 8)
                .forEach(System.out::println);
    }
}
