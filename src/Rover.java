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
      return turnRight90Deg();
    }
    return turnLeft90Deg();
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

  private char turnLeft90Deg() {
    if (headingTowards == 'N') {
      return 'W';
    } else if (headingTowards == 'W') {
      return 'S';
    } else if (headingTowards == 'S') {
      return 'E';
    }
    return 'N';
  }
}

