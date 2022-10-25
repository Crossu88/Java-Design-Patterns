public class King implements ICommandChessPiece {
  private int xPos;
  private int yPos;

  public King() {
  }

  public King(int x, int y) {
    xPos = x;
    yPos = y;
  }

  @Override
  public void move() {
    xPos += 1;
    yPos += 1;
  }

  @Override
  public void undo() {
    xPos -= 1;
    yPos -= 1;
  }

  @Override
  public String toString() {
    char xChar = (char) ('A' + (xPos % 8));
    return "King at " + (xChar) + (yPos + 1);
  }
}
