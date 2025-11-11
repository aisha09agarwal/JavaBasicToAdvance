package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 5;
        int variable;

        variable = a;
        System.out.println(variable);//5

        variable=0;
        variable += a;
        System.out.println(variable);//5

        variable -= 3;
        System.out.println(variable);//2

        variable *= a;
        System.out.println(variable);//10

        variable /= a;
        System.out.println(variable);//2
    }
}
