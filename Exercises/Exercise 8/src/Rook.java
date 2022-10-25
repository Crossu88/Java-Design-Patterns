public class Rook implements ICommandChessPiece {
  private int xPos;
  private int yPos;

  public Rook() {
  }

  public Rook(int x, int y) {
    xPos = x;
    yPos = y;
  }

  @Override
  public void move() {
    xPos += 3;
  }

  @Override
  public void undo() {
    xPos -= 3;
  }

  @Override
  public String toString() {
    char xChar = (char) ('A' + (xPos % 8));
    return "Rook at " + (xChar) + (yPos + 1);
  }
}
