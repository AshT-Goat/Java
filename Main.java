//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // gfgfgfhg
        /*
        System.out.print("hi");
        String name = "Ashrith";
        System.out.println(name);
        int age = 15;
        System.out.println("hey i am " + age);
        double decimal = 0.6;
        boolean isTrue = (15/3 == 4);
        System.out.println(isTrue);
        System.out.println(5/0.4);
        Scanner scan = new Scanner(System.in);
        System.out.println("Gimmie  anumber");
        int num = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("gimmie a word");
        String word = scan1.nextLine();
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Gimmie  anumber");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("postiive number");
        }
        else if (num == 0) {
            System.out.println("the numebr is zero");
        }
        else {
            System.out.println("nah its negative");
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Gimmie  anumber");
        int num1 = scan1.nextInt();
        if (num > num1) {
            System.out.println(num + " is greater than " + num1);
        }
        else if (num == num1) {
            System.out.println(num + " is equal to " + num1);
        }
        else {
            System.out.println(num1 + " is greater than " + num);
        }
    }
}