
public abstract class PointOfSale {
    private IOrderSystem orderSystem;
    public void TakePayment(IPaymentType payment) {}
    public void TakeOrder() {
        orderSystem.TakeOrder();
    }
    public void SetOrderSystem(IOrderSystem newOrderSystem) {
        orderSystem = newOrderSystem;
    }
}