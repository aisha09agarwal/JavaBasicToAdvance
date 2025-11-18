package Annotations;

//@SuppressWarnings("unused") // suppressing unused warning
public class Main {

    @SuppressWarnings("deprecation") // suppressing deprecation warning   
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.makeCall(); // Using deprecated method

    }
}
