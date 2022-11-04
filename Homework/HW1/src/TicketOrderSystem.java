import java.util.Scanner;

public class TicketOrderSystem implements IOrderSystem {
    @Override
    public void TakeOrder() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the ticket number");

        String ticketNumber = in.nextLine();
    }
}
