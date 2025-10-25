// class Dog{
//     String color;//data member
//     String breed;

//     String getDogColor(){ //data method
//         return color;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public static void main(String[] args){
//         Dog rottweiler = new Dog();
//         rottweiler.setColor("Black");
//         System.out.println(rottweiler.color);
//     }
// }
class Animal{
    private String color;//data member

    public String getColor(){ //data method
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Cat{
    public static void main(String[] args){
        Animal c = new Animal();
        c.setColor("White");
        System.out.println(c.getColor());
    }
}