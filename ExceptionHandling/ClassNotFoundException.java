package ExceptionHandling;

// public class ClassNotFoundException {
//     public static void main(String[] args) {
//         method1();
//     }

//     public static void method1(){
//         throw new ClassNotFoundException(); //class not found exception
//     }
// }

//Lets handle the above exception using throw and throws keyword

// public class ClassNotFoundException {
//     public static void main(String[] args) throws ClassNotFoundException{
//         method1();
//         //handle it here
//     }

//     public static void method1() throws ClassNotFoundException {
//         throw new java.lang.ClassNotFoundException("Demo Class not found");
//     }
// }


//Using try catch block to handle the exception
// public class ClassNotFoundException {
//     public static void main(String[] args) {
//         method1();
//     }

//     public static void method1() throws ClassNotFoundException {
//         try {
//             throw new ClassNotFoundException();
//         } catch (ClassNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
// }
