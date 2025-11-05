package TypesOfClasses;

//normal enum class
public enum EnumClass {
   MONDAY,
   TUESDAY,
   WEDNESDAY,
   THURSDAY,
   FRIDAY,
   SATURDAY,
   SUNDAY;
}

//enum class with constant values
//MONDAY(101,"!st day of the week"),...
/*
 * private int val;
 * private string comment;
 * EnumClass(int val, String comment){
 * this.val = val;
 * this.comment = comment;
 * }
 * 
 * public int getVal(){
 * return val;
 * }
 * public String getComment(){
 * return comment;
 * }
 * 
 * public static EnumClass getEnumFromValue(int value){
 * for(EnumClass sample : EnumClass.values()){
 * if(sample.val == value){
 * return samle;
 * }
 * }
 * return null;
 * }
 */


 /*
  * method override with contants
  * MONDAY{
  *     public void dummMethod(){
  *         Sysout("Monday");}}
  defaultDummy(){
  Sysout("Default");}
  */

  //enum with abstract method

  //enum implements interface

class Main{
    public static void main(String args[]){
        for(EnumClass sample : EnumClass.values()){
            System.out.println(sample.ordinal());
        }
        /*
         * Output
         * 0
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         */

        EnumClass enumVariables = EnumClass.valueOf("FRIDAY");
        System.err.println(enumVariables.name());
        //Output : FRIDAY

        /*
         * EnumClass sampleVar = EnumClass.getEnumFromValue(107);
         * Sysout(sampleVar.getComment());
         */
    }
}
