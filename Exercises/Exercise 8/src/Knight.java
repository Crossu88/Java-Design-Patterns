public class Knight implements ICommandChessPiece {
    private int xPos;
    private int yPos;

    public Knight() { }
    public Knight(int x, int y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public void move() {
        xPos += 1;
        yPos += 2;
    }

    @Override
    public void undo() {
        xPos -= 1;
        yPos -= 2;
    }

    @Override
    public String toString() {
        char xChar = (char) ('A' + (xPos % 8));
        return "Knight at " + (xChar) + (yPos + 1);
    }
}
