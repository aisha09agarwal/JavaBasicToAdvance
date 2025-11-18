package ExceptionHandling;

public class Main {

    //will the the exception stack trace(contains method calls) be printed
    public static void main(String[] args) {
        Main sampleObj = new Main();
        sampleObj.method1();
    }

    private void method1(){
        method2();
    }

    private void method2(){
        method3();
    }

    private void method3() {
        int result = 10 / 0;
    }
    
}
