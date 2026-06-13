import java.util.*;
public class Loops {
    public static void main(String[] args) {
        int num = 5;
        while (num >= 1) {
            System.out.println(num);
            num--;
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        int num1 = 0;
        while (true) {
            System.out.println(num1);
            num1 += 2;

            if (num1 == 10) {
                break;
            }
        }

        for (int i = 0; i < 9; i += 2) {
            System.out.println(i);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Gimmie  anumber");
        int num2 = scan.nextInt();
        for (int i = 1; i <= num2; i++) {
            System.out.println(i);
        }
        int num3 = 1;
        while (num3 <= num2) {
            System.out.println(num3);
            num3++;

        }
    }
}
