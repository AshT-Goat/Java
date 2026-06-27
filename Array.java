import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int[] ages = new int[5];
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter Name ");
            names[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(names));
        int[] age = {7, 9, 10, 12, 19};
        System.out.println(age.length);
        age[3] = 13;
        System.out.println(age[3]);
        System.out.println(Arrays.toString(age));
    }

}
