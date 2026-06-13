import java.util.*;
public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Bread");
        list.add("Bread");
        list.add("Cheese");
        list.add("Pizza");
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("Bread")) {
                list.set(i, "juice");
          //      list.remove(i);
               // i--;
            }
            //System.out.println(list.get(i));
        }
        System.out.println(list);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(5);
        nums.add(28);
        nums.add(21);
        nums.add(12);
        System.out.println(nums.get(nums.size()-1));
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }



    }
}
