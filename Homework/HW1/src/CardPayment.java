import java.util.Scanner;

public class CardPayment implements  IPaymentType {
    @Override
    public void PerformTransaction() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the credit card number");

        String cardNumber = in.nextLine();

        System.out.println("Enter the amount to charge for the sale");

        float saleAmount = in.nextFloat();
    }
}
