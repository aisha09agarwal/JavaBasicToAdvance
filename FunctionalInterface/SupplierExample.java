package FunctionalInterface;
import java.util.function.Supplier;
import java.time.LocalTime;

class SupplierExample {
    public static void main(String[] args) {
        // Supplier that gives current time
        Supplier<String> timeSupplier = () -> LocalTime.now().toString();

        System.out.println("Current time: " + timeSupplier.get());
    }
}

