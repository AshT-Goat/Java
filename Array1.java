import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = {3, 6, 10, 11, 15};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
        String[] groceries = {"Milk", "Eggs", "Butter", "Juice"};
        String search = "Juice";
        System.out.println("What do you want to replace " + search + "?");
        String replace = scan.nextLine();

        for (int i = 0; i < groceries.length; i++) {
            if (groceries[i].equals(search)) {
                groceries[i] = replace;
            }
        }
        System.out.println(Arrays.toString(groceries));
        int[] grades = new int[5];
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter your grades: ");
            grades[i] = scan.nextInt();
            while (grades[i] < 0 || grades[i] > 100) {
                System.out.print("Invalid! Enter your grades bwtween 0-100: ");
                grades[i] = scan.nextInt();
            }
            sum += grades[i];

        }
        double avg = sum / grades.length;
        System.out.println("The average grade is " + avg);
    }
}
