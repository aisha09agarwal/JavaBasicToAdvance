package Annotations;

@FunctionalInterface
public interface Bird {
    public boolean fly();

    //public void eat();  will show error because functional interface can have only one abstract method
}
