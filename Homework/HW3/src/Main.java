public class Main {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();

        waitress.AddToOrder(new Burger());
        waitress.AddToOrder(new Fries());
        waitress.AddToOrder(new Milkshake());

        waitress.FinishOrder();
    }
}