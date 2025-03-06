import java.util.InputMismatchException;

public class DevTest {
    public static void main(String[] args) {

    }

    public static double CtoF(double Celsius) {

        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");
        System.out.println("----------------------");

        for (double celsius = -100.0; Celsius <= 100.0; Celsius++) {
            double fahrenheit = CtoF(Celsius);
            System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);
        }

            return (Celsius * 9 / 5) + 32;
        }
    }




