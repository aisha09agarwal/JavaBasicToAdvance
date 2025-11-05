package TypesOfClasses;

import TypesOfClasses.NonStaticOuterClass.NonStaticInnerClass;

//static nested class with private access modifier
class StaticOuterClass{
    int instanceVariable = 10;
    static int classVariable = 20;

    static class NestedClass{
        public void staticPrint(){
            System.out.println(classVariable);
        }
    }

    private static class privateStaticNestedClass{
        public void print(){
            System.out.println(classVariable);
        }
    }

    public void display(){
        privateStaticNestedClass privateStaticNestedObj = new privateStaticNestedClass();
        privateStaticNestedObj.print();
    }
}

//Some other class inherits static inner class
class inheritedStaticInnerClass extends StaticOuterClass.NestedClass{
    public void staticDisplay(){
        staticPrint();
    }
}

//non-static or inner class also known as member inner class
class NonStaticOuterClass{
    int instanceVariable = 10;
    static int classVariable = 20;

    class NonStaticInnerClass{
        public void print(){
            System.out.println(classVariable + instanceVariable);
        }
    } 
    //one inner class inherits another inner class
    class NonStaticInnerClassChild extends NonStaticInnerClass{
        int index = 6;
    }
}

//Local Inner Class
class localOuterClass{
    int localInstanceVariable = 10;
    static int localClassVariable = 2;
    public void localDisplay(){
        int methodLocalVariable = 3;

        class LocalInnerClass{
            int localInnerVariable = 7;

            public void localPrint(){
                System.out.println(localClassVariable + localInstanceVariable + methodLocalVariable + localInnerVariable);
            }
        }

        LocalInnerClass localObj = new LocalInnerClass();
        localObj.localPrint();
    }
}

//anonymous inner class
abstract class Car{
    public abstract void pressBreak();
}
class Test{
    public static void main(String[] args) {
        Car audiCarObj = new Car(){
            public void pressBreak(){

            }
        };
        audiCarObj.pressBreak();
    }
}
public class NestedClass {
    public static void main(String[] args) {
        StaticOuterClass.NestedClass nestedObj = new StaticOuterClass.NestedClass();//outerclass.nested class bcz directly associated bcz of static
        nestedObj.staticPrint();

        StaticOuterClass outerClassObj = new StaticOuterClass();
        outerClassObj.display();

        NonStaticOuterClass NonStaticOuterObj = new NonStaticOuterClass();
        NonStaticInnerClass NonStaticInnerClass = NonStaticOuterObj.new NonStaticInnerClass();
        NonStaticInnerClass.print();

        localOuterClass localOuterObj = new localOuterClass();
        localOuterObj.localDisplay();
    }
}
