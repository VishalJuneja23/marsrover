public class Rover {
  private int coordinateX;
  private int coordinateY;
  private char headingTowards;

  public Rover(int coordinateX, int coordinateY, char headingTowards) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
    this.headingTowards = headingTowards;
  }

  public char turn(char turnCommand) {
    if (turnCommand == 'R') {
      headingTowards = turnRight90Deg();
    }
    return headingTowards;
  }

  private char turnRight90Deg() {
    if (headingTowards == 'N') {
      return 'E';
    } else if (headingTowards == 'E') {
      return 'S';
    } else if (headingTowards == 'S') {
      return 'W';
    }
    return 'N';
  }
}

