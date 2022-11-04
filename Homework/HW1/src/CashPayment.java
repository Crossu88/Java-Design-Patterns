import java.util.Scanner;

public class CashPayment implements IPaymentType {
    @Override
    public void PerformTransaction() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of the sale");

        float saleAmount = in.nextFloat();

        System.out.println("Enter the amount of the cash payment");

        float cashAmount = in.nextFloat();

        float changeAmount = cashAmount - saleAmount;

        double roundedAmount = (double) Math.round(changeAmount * 100) / 100;

        System.out.println("The total change of the transaction is " + (roundedAmount));
    }
}
