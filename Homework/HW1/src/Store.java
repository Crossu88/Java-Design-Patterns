public class Store extends PointOfSale {
    public Store() {
        SetOrderSystem(new ComputerOrderSystem());
    }

    public void TakePayment(IPaymentType payment) {
        payment.PerformTransaction();
    }
}