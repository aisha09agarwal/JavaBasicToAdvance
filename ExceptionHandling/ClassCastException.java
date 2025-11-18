package ExceptionHandling;

public class ClassCastException {
    
    public static void main(String[] args) {
        Object val = 0;
        System.out.println("Value: " + (String) val );//integer cannot be cast to 
    }
}
