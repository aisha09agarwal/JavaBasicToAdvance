package Operators;

public class UnaryOperators{
    public static void main(String[] args) {
        int a = 5;
        boolean flag = true;

        //increment
        System.out.println(a++);//5
        System.out.println(++a);//7

        //decrement
        System.out.println(a--);//7
        System.out.println(--a);//5

        //logical not operator
        System.out.println(!flag);//false

        //unary minus operator
        System.out.println(-a);//-5

        //unary plus operator
        System.out.println(+a);//5
    }
}