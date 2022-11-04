public class Kiosk extends PointOfSale {
    public Kiosk() {
        SetOrderSystem(new TicketOrderSystem());
    }

    public void TakePayment(IPaymentType payment) {
        if (!(payment instanceof CashPayment)) {
            System.out.println("Invalid payment method");
            return;
        }

        payment.PerformTransaction();
    }
}