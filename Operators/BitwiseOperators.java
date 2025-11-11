package Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        
        int a = 4;
        int b = 6;

        //bitwise AND
        System.out.println(a & b);//4

        //bitwise OR
        System.out.println(a | b);//6

        //bitwise XOR
        System.out.println(a ^ b);//2

        //bitwise NOT, bitwise complement of any integger n is -(n+1)
        System.out.println(~a);//-5
    }
}
