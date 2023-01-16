import java.security.SecureRandom;
import java.util.stream.IntStream;

public class IntStreamMethodGenerate {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        //SecureRandom.ints().limit(10).forEach(System.out::println);
        IntStream.generate(()-> random.nextInt()).limit(10).forEach(System.out::println);
    }
}
