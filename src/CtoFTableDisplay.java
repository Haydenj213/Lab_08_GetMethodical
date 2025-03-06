import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean result = true;

            result = SafeInput.getYNConfirm(in, "Would you like to see a table of temperatures converted from Celsius to Fahrenheit?");

            if (!result) {

                System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");
                System.out.println("----------------------");

                for (int celsius = -100; celsius <= 100; celsius++) {
                    double fahrenheit = SafeInput.CtoF(celsius);
                    System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);
                }

                System.out.println("Thank you for viewing the table.");

            } else {
                System.out.print("Thank you. Have a good day!");
        }



    }
}




