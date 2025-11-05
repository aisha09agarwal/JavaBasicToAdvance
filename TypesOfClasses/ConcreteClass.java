package TypesOfClasses;

// whose instance can be created using NEW keyword
class Person{ //public
    int empId;

    Person(int empId){
        this.empId = empId;
    }

    public int getEmpId(){
        return empId;
    }
}

//or 

interface Shape {
    public void computeArea();
}
//concrete class should have all the method implementation
class Rectangle implements Shape{
    public void computeArea(){
        System.out.println("area");
    }
}
public class ConcreteClass {
    public static void main(String[] args) {
        //objects created 
        Person personObj = new Person(12);
        Rectangle rectangle = new Rectangle();
        //Shape s = new Shape(); cannot be created
    }
}
