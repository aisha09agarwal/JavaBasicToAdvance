package MemoryManagement;
import HelperClass.Person;

public class MemoryManagement {
   public static void main(String[] args) {//block of memory for main(scope/frame)
    int primitiveVariable1 = 10;//stack memory
    Person personObj = new Person();// person object is stored in heap but personObj(reference of object is stored within scope)
    String stringLiterals = "24";//in string pool but the stringliterals is stored in stack
    MemoryManagement memObj = new MemoryManagement();//object is stored in heap but memObj(reference of object is stored within scope)
    memObj.MemoryManagementTest(personObj);//new scope created
   }
   
   private void MemoryManagementTest(Person personObj){
    Person personObj2 = personObj;//new reference in new scope but same heap memory
    String stringLiterals2 = "24";//new refernce in new scope but same string pool
    String stringLiterals3 = new String("24");//new reference new string pool
   }//delete scope2 in LIFO manner
}//delete scope1 in LIFO order
//now garbage collector deletes unreferenced memory from heap[System.gc()]//no guarantee JVM manages it
