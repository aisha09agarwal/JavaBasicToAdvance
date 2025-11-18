package Annotations;

public class Eagle implements Bird {

    @Override // annotations(cannot be used for classes)
    public boolean fly() {
        return true;
    }  
}
