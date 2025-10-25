// class Father {
//     public static void business(){
//         System.out.println("I have a business");
//     }
// }
// class Son extends Father{
//     public static void job(){
//         System.out.println("I have a job");
//     }
//     public static void main(String[] args){
//         business();
//         job();
//     }
// }

class Vehicle{
    boolean hasEngine;
    boolean getEngine(){
        return hasEngine;
    }
}

class Bike extends Vehicle{
    int wheel;
    String type;
    
    String getbikeType(){
        type = "Sports";
        return type;
    }

    public static void main(String[] args){
        Bike splender = new Bike();
        splender.getEngine();
    }
}

//single inheritance
//multilevel inheritance
//hierarchical inheritance
//multilevel inheritance (supported using interface)