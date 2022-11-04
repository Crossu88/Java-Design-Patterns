public class Leds extends TreeDecorator {
    public Leds(Tree decoratedTree) {
        super(decoratedTree);

        cost = 10;
        description = "LEDs";
    }
}
