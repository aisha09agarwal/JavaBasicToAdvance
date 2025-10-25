//Achieve abstraction using interface

interface Car{
    public void applyBreak();
}

class CarImplementation implements Car{
    public static void main(String[] args){
        CarImplementation car = new CarImplementation();
        car.applyBreak();
    }

    @Override
    public void applyBreak() {
        System.out.println("Break Applied");
    }
}

