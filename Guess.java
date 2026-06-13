import java.util.*;
public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int secret = rand.nextInt(20) +1;
        int guess = 0;
        System.out.println("Gimmie a number between 1 and 20");
        while (guess != secret) {
            System.out.println("enter ur number");
            guess = scan.nextInt();
            if (guess < secret) {
                System.out.println("too low");
            }
            else if (guess > secret) {
                System.out.println("too high");
            }
            else {
                System.out.println("you win");
            }
        }
    }
}

