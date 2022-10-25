public class Queen implements ICommandChessPiece {
  private int xPos;
  private int yPos;

  public Queen() {
  }

  public Queen(int x, int y) {
    xPos = x;
    yPos = y;
  }

  @Override
  public void move() {
    xPos += 0;
    yPos += 4;
  }

  @Override
  public void undo() {
    xPos -= 0;
    yPos -= 4;
  }

  @Override
  public String toString() {
    char xChar = (char) ('A' + (xPos % 8));
    return "Queen at " + (xChar) + (yPos + 1);
  }
}
