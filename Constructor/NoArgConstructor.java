import HelperClass.Person;
class Manager extends Person {
    Manager(){
        //super(); // this is default in java and adds it internally
        System.out.println("I am inside manager class");
    }
}

public class NoArgConstructor{
    public static void main(String[] args){
        Manager obj = new Manager();
    }
}
/*
 * Output
 * I am inside person class
 * I am inside manager class
 */