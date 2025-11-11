package FunctionalInterface;
import java.util.function.Function;

class FunctionExample {
    public static void main(String[] args) {
        // Function: input = String, output = Integer (string length)
        Function<String, Integer> findLength = str -> str.length();

        System.out.println(findLength.apply("Aisha")); // 5
        System.out.println(findLength.apply("Java"));  // 4
    }
}

