import java.util.*;
public class List2 {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> movies = new ArrayList<>();

    public static void main(String[] args) {
        while (true){
            menu();
            int choice = scan.nextInt();
            scan.nextLine();
            if (choice == 1){
                addMovie();
            }
            else if (choice == 2){
                removeMovie();
            }
            else if (choice == 3){
                viewMovies();
            }
            else if (choice == 4){
                searchMovie();
            }
            else if (choice == 5){
                break;
            }
            else{
                System.out.println("Invalid option!!!");
            }
        }





    }
    public static void menu(){
        System.out.println("1. Add Movie");
        System.out.println("2. Remove Movie");
        System.out.println("3. View movies");
        System.out.println("4. Search movie");
        System.out.println("5. Exit");
        System.out.println("Choice: ");

    }
    public static void addMovie(){
        System.out.print("Enter movie name: ");
        String movie = scan.nextLine();
        movies.add(movie);
        System.out.println("Movie added: " + movie);
    }
    public static void removeMovie(){
        if (movies.isEmpty()){
            System.out.println("There are no movies");
            return;
        }

        System.out.print("Enter movie name: ");
        String movie1 = scan.nextLine();
        if (movies.remove(movie1)){
            System.out.println("Movie Removed: " + movie1);
        }
        else{
            System.out.println("Movie not even there");
        }
    }
    public static void viewMovies(){
        System.out.println(movies);

    }
    public static void searchMovie(){
        System.out.print("Enter movie name: ");
        String search = scan.nextLine();
        if (movies.contains(search)){
            System.out.println("Movie found: " + search);
        }
        else{
            System.out.println("Movie not found: " + search);
        }
    }



}
