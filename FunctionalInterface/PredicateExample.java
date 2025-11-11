package FunctionalInterface;
import java.util.*;
import java.util.function.Predicate;

class PredicateExample {
    static void filterAndPrint(List<Integer> list, Predicate<Integer> condition) {
        for (int n : list) {
            if (condition.test(n)) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 5, 8, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;

        filterAndPrint(nums, isEven); // prints even numbers
        filterAndPrint(nums, isOdd);  // prints odd numbers
    }
}
