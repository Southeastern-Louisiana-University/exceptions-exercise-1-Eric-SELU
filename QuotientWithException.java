package chapter12;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int number1, int number2){
        if (number2 == 0){
            throw new ArithmeticException("Divisor can't be zero! ");
        }
        return number1/number2;
    }
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input two ints: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
        catch (ArithmeticException aExcept){
            System.out.println("Exception division by zero");
        }
        System.out.println("Execution continues......");
    }
}
