class Calculation{
    String name;
    int empId;

    Calculation(){
        this(19);
    }

    Calculation(int empId){
        this("Aisha", empId);
    }

    Calculation(String name, int empId){
        this.name = name;
        this.empId = empId;
    }
}

public class ConstructorChainingThis{
    public static void main(String args){
        Calculation cal = new Calculation();
    }
}