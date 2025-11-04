class Person{
    int empId;

    Person(int empId){
        this.empId = empId;
        System.out.println("This is person class");
    }
}

class Manager extends Person{
    int age;

    Manager(int empId, int age){
        super(empId); // We have to write super when parent class has parameterized constructor
        this.age = age;
        System.out.println("This is Manager class");
    }
}

public class ConstructorChainingSuper {
    
}
