import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int birthYear = 0;
            int month = 0;
            int hours = 0;
            int minutes = 0;
            int day = 0;


            birthYear = SafeInput.getRangedInt(in, "Please input your birth year", 1950, 2015);
            month = SafeInput.getRangedInt(in, "Please input your birth month (1-12)", 1, 12);
            hours = SafeInput.getRangedInt(in, "Please input the hour of the time you were born", 1, 24);
            minutes = SafeInput.getRangedInt(in, "Please input the minutes of the time you were born.", 1, 59);

        day = switch (month) {
            case 2 -> SafeInput.getRangedInt(in, "Please input your day of birth", 1, 29);
            case 4, 6, 9, 11 -> SafeInput.getRangedInt(in, "Please input your day of birth", 1, 30);
            default -> SafeInput.getRangedInt(in, "Please input your day of birth", 1, 31);
        };

            System.out.println("Your Birth Date and Time is " + month + "/" + day + "/" + birthYear + " at " + hours + ":" + minutes + ".");
    }

}

