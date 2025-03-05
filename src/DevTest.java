import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DevTest {
    public static void main(String[] args) {

    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {

        String getRegExString = "";
        boolean correct = false;

        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            getRegExString = pipe.nextLine();
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(getRegExString);

            if (matcher.matches()) {
                correct = true;
            } else {
                System.out.println("Invalid input. Please respond with a string with the correct RegEx");
            }

        } while (!correct);

        return getRegExString;

    }
}



