import java.util.*;
public class List1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(12);
        numbers.add(16);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 == 0){
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
    }
}
