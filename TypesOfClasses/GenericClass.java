package TypesOfClasses;

// class Print{
//     Object value;

//     public Object getPrintValue(){
//         return value;
//     }
//     public void setPrintValue(Object value){
//         this.value = value;
//     }
// }
// public class GenericClass {
//     public static void main(String[] args){
//         Print printObj1 = new Print();
//         printObj1.setPrintValue(1);
//         Object printValue = printObj1.getPrintValue();
//         if((int)printValue == 1){
//             //
//         }
//     }
// } 

// To solve this issue(typecasting) generic class is introduced

public class GenericClass<T>{
    T value;

    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value = value;
    }
}

class Main{
    public static void main(String[] args){
        GenericClass<Integer> printObj1 = new GenericClass<Integer>();
        printObj1.setPrintValue(1);
        Integer printValue = printObj1.getPrintValue();
        if(printValue == 1){
            //do something...
        }

        Pair<String, Integer> pairObj = new Pair<>();
        pairObj.put("hello", 123);
    }
}

//inheritance with generic class

class InheritedGenericClass extends GenericClass<String>{
    //some functionalities
}

//sub class of a generic class

class SubGenericClass<T> extends GenericClass<T>{
    ///somethingssssss....
}

//more than one generic types

class Pair<K, V>{
    K key;
    V value;

    public void put(K key, V Value){
        this.key = key;
        this.value = value;
    }
}
