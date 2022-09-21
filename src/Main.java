import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal1= new Calculator();
        System.out.println(cal1.addition(4,6));
        System.out.println(cal1.substraction(8, 4));
        System.out.println(cal1.multiplication(6, 6));
        System.out.println(cal1.division(6, 2));
    }
}