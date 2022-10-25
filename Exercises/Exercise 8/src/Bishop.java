public class Bishop implements ICommandChessPiece {
    private int xPos;
    private int yPos;

    public Bishop() { }
    public Bishop(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public void move() {
        xPos += 3;
        yPos += 3;
    }

    @Override
    public void undo() {
        xPos -= 3;
        yPos -= 3;
    }

    @Override
    public String toString() {
        char xChar = (char) ('A' + (xPos % 8));
        return "Bishop at " + (xChar) + (yPos + 1);
    }
}
