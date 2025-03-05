import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = " "; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt) {

        int retInt = 0;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retInt = pipe.nextInt();
        } while (retInt == 0);

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {

        double retDouble = 0.0;
        String trash = "";

        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retDouble = pipe.nextDouble();
        } while (retDouble == 0.0);

        return retDouble;

    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {

        int retInt = 0;
        String trash = "";

        do {
            System.out.print("\n" + prompt + " (Range: " + low + " - " + high + "): "); // show prompt add space
            retInt = pipe.nextInt();
            if (retInt < low) {
                System.out.println("You input a number that is lower than the range. Please enter a higher number.");
            } else if (retInt > high) {
                System.out.println("You input a number that is higher than the range. Please enter a lower number.");
            }

        } while (low > retInt || retInt > high);

        return retInt;

    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {

        double retDouble = 0.0;
        String trash = "";

        do {
            System.out.print("\n" + prompt + " (Range: " + low + " - " + high + "): "); // show prompt add space
            retDouble = pipe.nextDouble();
            if (retDouble < low) {
                System.out.println("You input a number that is lower than the range. Please enter a higher number.");
            } else if (retDouble > high) {
                System.out.println("You input a number that is higher than the range. Please enter a lower number.");
            }

        } while (low > retDouble || retDouble > high);

        return retDouble;

    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        boolean getYNConfirm = false;
        boolean valid = false;
        String response = "";

        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            response = pipe.nextLine();

            if (response.equalsIgnoreCase("N")) {
                getYNConfirm = true;
                valid = true;
            } else if (response.equalsIgnoreCase("Y")) {
                getYNConfirm = false;
                valid = true;
            } else {
                System.out.println("Please respond with Y (Yes) or N (No)");
            }

        } while (!valid);

        return getYNConfirm;

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












