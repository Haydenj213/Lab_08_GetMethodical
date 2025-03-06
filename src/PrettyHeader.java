import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input text that you would like to put into a fancy header.");

        String message = in.nextLine();
        SafeInput.prettyHeader(message);
    }

}
