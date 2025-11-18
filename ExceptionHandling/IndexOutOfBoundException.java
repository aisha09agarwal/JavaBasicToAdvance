package ExceptionHandling;

public class IndexOutOfBoundException {
    public static void main(String[] args) {
        int[] val = new int[2];
        System.out.println(val[5]); //Array index out of bound

        String str = "Hello";
        System.out.println(str.charAt(10)); //String index out of bound
    }
}
