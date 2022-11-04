public class Main {
    public static void main(String[] args) {
        PointOfSale kiosk = new Kiosk();
        PointOfSale store = new Store();

        kiosk.TakeOrder();
        store.TakeOrder();

        kiosk.TakePayment(new CashPayment());
        kiosk.TakePayment(new CardPayment());

        store.TakePayment(new CashPayment());
        store.TakePayment(new CardPayment());
    }
}
