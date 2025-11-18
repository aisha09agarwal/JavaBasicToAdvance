package Annotations;
import java.util.List;
import java.util.ArrayList;


public class Log {
    
    @SafeVarargs //to suppress warnings related to heap pollution(from java 9 this annotation can be used in private methods also)
    public static void printLogValues(List<Integer>... logNumbersList){

        Object[] objectList = logNumbersList;

        List<String> stringList = new ArrayList<>();
        stringList.add("Log1");
        objectList[0] = stringList; //Heap Pollution (object of one type String, storing the reference of another type Object)
    }
}
