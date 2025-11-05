package TypesOfClasses;

import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
    private final String name;
    private final List<Object> petNameList;

    ImmutableClass(String name, List<Object> petNameList){
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetNameList(){
        return new ArrayList<>(petNameList);
    }
}

class Main{
    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("Snowy");
        petNames.add("Brownie");

        ImmutableClass obj = new ImmutableClass("myName", petNames);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
        //Output: Snowy, Brownie ; hello would not be added
    }
}
