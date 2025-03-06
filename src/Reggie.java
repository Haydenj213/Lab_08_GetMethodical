import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ucStudentNumPattern = "^(M|m)\\d{5}$";
        String menuChoicePattern = "^[OoSsVvQq]$";

        String ssn = SafeInput.getRegExString(in, "Please enter your SSN in the correct format (XXX-XX-XXXX)", ssnPattern);
        String ucStudentNum = SafeInput.getRegExString(in, "Please enter your UC Student M Number in the correct format (MXXXXX)", ucStudentNumPattern);
        String menuChoice = SafeInput.getRegExString(in, "Please enter your menu choice in the correct format (O, S, V, Q)", menuChoicePattern);

        System.out.println("Your SSN is " + ssn + ". Your UC Student Number is " + ucStudentNum + ". Your menu choice is " + menuChoice);

    }
}
