package TypesOfClasses;

//abstraction using interface
interface Shape {
    public void computeArea();
}

class Rectangle implements Shape{
    public void computeArea(){
        System.out.println("area");
    }
}

//abstraction using abstract class

//cannot create instance of abstract class
abstract class Car{
    int mileage;

    Car(int mileage){
        this.mileage = mileage;
    }

    public abstract void pressBreak();
    public abstract void pressClutch();
    public int getNumberOfWheels(){
        return 4;
    }
}

abstract class LuxuryCar extends Car{
    LuxuryCar(int mileage){
        super(mileage);
    }

    public abstract void pressDualBreakSystem();

    public void pressBreak(){
        //implementation
    }
}

class Audi extends LuxuryCar{
    Audi(int mileage){
        super(mileage);
    }

    public void pressDualBreakSystem(){

    }

    public void pressClutch(){

    }
}

public class AbstractClass{
    public static void main(String[] args) {
        
    }
}
