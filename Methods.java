import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number");
        double a = scan.nextDouble();
        System.out.println("whatchu wanna do?");
        String sign = scan.next();
        System.out.println("Enter 2nd number");
        double b = scan.nextDouble();
        if (sign.equals("add")) {
            add(a, b);
        }
        else if (sign.equals("subtract")){
            subtract(a, b);
        }
        else if (sign.equals("multiply")){
            multiply(a, b);
        }
        else if (sign.equals("divide")){
            divide(a, b);
        }
        else {
            System.out.println("Invalid input");
        }
    }
    public static void greet() {
        System.out.println("Welcome to the Greeting!");
    }
    public static void add(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }
    public static void subtract(double a, double b) {
        double subtract = a - b;
        System.out.println(subtract);
    }
    public static void multiply(double a, double b) {
        double multiply = a * b;
        System.out.println(multiply);
    }
    public static void divide(double a, double b) {
        double divide = a / b;
        System.out.println(divide);
    }
}
