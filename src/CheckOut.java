import java.util.Scanner;
import java.lang.Math;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalCost = 0.0;
        boolean done = true;

        do {
            itemPrice = SafeInput.getRangedDouble(in,"Please enter the Price of your item.", 0.50, 10.00);
            totalCost += itemPrice;
            done = SafeInput.getYNConfirm(in, "Do you have any more item prices to put in?");
        } while (!done);

        double roundedCost = Math.round(totalCost * 100) / 100.0;

        System.out.println("The total cost of your items is: $" + roundedCost);

    }

}
