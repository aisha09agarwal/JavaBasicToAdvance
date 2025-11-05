package TypesOfClasses;

//should not extend any class or implements any interface
public class PojoClass {//class should be public

    //has a default constructor which is always public
    //should not have any annotations
    int name; //contains variables
    private int rollNumber;
    protected String address;

    //should have getter and setter method
    public int getName(){
        return name;
    }

    public void setName(int name){
        this.name = name;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getaddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
