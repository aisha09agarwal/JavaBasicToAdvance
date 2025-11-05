package TypesOfClasses;
import HelperClass.Person;
import TypesOfClasses.Audi;

public class SuperAndSubClass {
    public static void main(String[] args) {
        SuperAndSubClass obj = new SuperAndSubClass();

        Object obj1 = new Person();
        Object obj2 = new Audi(10);

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}
