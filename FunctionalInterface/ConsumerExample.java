package FunctionalInterface;
import java.util.function.Consumer;

class ConsumerExample {
    public static void main(String[] args) {
        // Consumer takes a string and prints it
        Consumer<String> printer = msg -> System.out.println("Hello, " + msg);

        printer.accept("Aisha"); // prints: Hello, Aisha
        printer.accept("Java");  // prints: Hello, Java
    }
}

