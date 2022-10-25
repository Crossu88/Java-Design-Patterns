public class Pawn implements ICommandChessPiece {
    private int xPos;
    private int yPos;

    public Pawn() { }
    public Pawn(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public void move() {
        yPos += 1;
    }

    @Override
    public void undo() {
        yPos -= 1;
    }

    @Override
    public String toString() {
        char xChar = (char) ('A' + (xPos % 8));
        return "Pawn at " + (xChar) + (yPos + 1);
    }
}
