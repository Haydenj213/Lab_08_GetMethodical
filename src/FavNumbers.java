import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favoriteInt = 0;
        double favoriteDouble = 0.0;

        favoriteInt = SafeInput.getInt(in, "Enter your favorite Integer.");
        favoriteDouble = SafeInput.getDouble(in, "Enter your favorite Double.");
        System.out.println("\n Your favorite Integer is " + favoriteInt + ". Your favorite Double is " + favoriteDouble + ".");
    }
}
