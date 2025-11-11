package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println(a<3 && a!=b);//false   
        System.out.println(a>3 && a!=b);//true
        System.out.println(a<3 || a!=b);//true
        System.out.println(a>3 || a!=b);//true
    }
}
