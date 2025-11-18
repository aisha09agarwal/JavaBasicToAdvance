package JavaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    //public static void main(String[] args) {
        // Class eagleClass = Eagle.class;

        // //Reflection of Eagle class
        // System.out.println("Class Name: " + eagleClass.getName());//JavaReflection.Eagle
        // System.out.println(Modifier.toString(eagleClass.getModifiers()));//public

        // //Reflection of Methods
        // Method[] methods = eagleClass.getMethods(); //getDeclaredMethods() to include private methods
        // for(Method method : methods){
        //     System.out.println("Method Name: " + method.getName()); //fly
        //     System.out.println("Return Type: " + method.getReturnType());//void
        //     System.out.println("Class Name: " + method.getDeclaringClass());//Eagle, Object
        //     System.out.println("-----");
        // }
    //}

    //invoking a method using reflection
    // public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, SecurityException {
    //     Class eagleClass = Class.forName("Eagle");
    //     Object eagleObject = eagleClass.newInstance();

    //     Method flyMethod = eagleClass.getMethod("fly"); 
    //     flyMethod.invoke(eagleObject);   
    // }

    //field reflection
    // public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException {
    //     Class eagleClass = Eagle.class;

    //     Field[] fields = eagleClass.getFields(); //getDeclaredFields() to include private fields
    //     for(Field field : fields){
    //         System.out.println("Field Name: " + field.getName()); //breed
    //         System.out.println("Field Type: " + field.getType());//String
    //         System.out.println("-----");
    //     }

    //     //setvalue of public field
    //     Eagle eagleObj = new Eagle();
    //     Field field = eagleClass.getDeclaredField("breed");
    //     //field.setAccessible(true); to access private fields
    //     field.set(fields, field);
    //     System.out.println("Breed: " + eagleObj.breed);
    // }

    //Reflecting private constructor
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        Class eagleClass = Eagle.class;
        
        Constructor[] eagleContructorsList = eagleClass.getDeclaredConstructors();
        for(Constructor constructor : eagleContructorsList){
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));

            constructor.setAccessible(true);
            Eagle eagleObj = (Eagle) constructor.newInstance();
            eagleObj.fly();
        }
    }
}